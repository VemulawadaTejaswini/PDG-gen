public class Main {

    protected static String calc(String input) {
        final int data = Integer.parseInt(input);

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= data; i++) {
            if (i % 3 == 0 || i % 10 == 3) {
                sb.append(' ');
                sb.append(i);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        final String line = readLine();
        System.out.println(calc(line));
    }

    private static String readLine() {
        java.util.Scanner s = null;
        try {
            s = new java.util.Scanner(System.in);
            return s.nextLine();
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}