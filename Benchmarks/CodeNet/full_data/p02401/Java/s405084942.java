import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) {
        System.out.println(process(readAll(System.in)));
    }

    protected static String process(String data) {
        final String[] lines = splitForLines(data);

        StringBuilder sb = new StringBuilder();
        for (String s : lines) {

            final Input input = Input.valueOf(s);

            Integer result = null;

            switch (input.operator) {
                case ADD:
                    result = input.a + input.b;
                    break;
                case SUBTRACT:
                    result = input.a - input.b;
                    break;
                case MULTIPLY:
                    result = input.a * input.b;
                    break;
                case DIVIDE:
                    result = input.a / input.b;
                    break;
            }

            if (result == null) {
                continue;
            }

            if (sb.length() > 0) {
                sb.append(LINE_SEPARATOR);
            }

            sb.append(result);
        }

        return sb.toString();
    }

    private static String readAll(InputStream is) {
        InputStreamReader r = null;
        BufferedReader br = null;

        try {
            r = new InputStreamReader(is);
            br = new BufferedReader(r);
            StringBuilder sb = new StringBuilder();
            String s;

            while ((s = br.readLine()) != null) {
                sb.append(s).append('\n');
            }

            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                }
            }
        }
    }

    static class Input {
        final int a;
        final int b;
        final Operator operator;

        Input(int a, int b, Operator operator) {
            this.a = a;
            this.b = b;
            this.operator = operator;
        }

        static Input valueOf(String line) {
            final String[] split = line.split(" ");
            final int a = Integer.parseInt(split[0]);
            final Operator op;

            if ("+".equals(split[1])) {
                op = Operator.ADD;
            } else if ("-".equals(split[1])) {
                op = Operator.SUBTRACT;
            } else if ("*".equals(split[1])) {
                op = Operator.MULTIPLY;
            } else if ("/".equals(split[1])) {
                op = Operator.DIVIDE;
            } else if ("?".equals(split[1])) {
                op = Operator.END;
            } else {
                throw new IllegalArgumentException(split[1]);
            }

            final int b = Integer.parseInt(split[2]);

            return new Input(a, b, op);
        }
    }

    enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE, END
    }

    private static String[] splitForLines(String lines) {
        return lines.split("\\n");
    }

}