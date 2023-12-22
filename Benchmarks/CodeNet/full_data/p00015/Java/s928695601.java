import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Writer writer = new Writer();
        Reader reader = new Reader();

        final int count = reader.readInt();
        for (int i = 0; i < count; i++) {
            final String string1 = reader.read();
            final String string2 = reader.read();
            final BigNumber number1 = BigNumber.parse(string1);
            final BigNumber number2 = BigNumber.parse(string2);

            final BigNumber sum = BigNumber.add(number1, number2);

            final String sumString = sum.toString();
            if (sumString.length() > 80) {
                writer.write("overflow\n");
            } else {
                writer.write(sumString + "\n");
            }
        }

        writer.print();
    }

}

class Method {

    private Method(){}

    public static int getDigits(int value) {
        int digits = 0;
        while (value != 0) {
            value /= 10;
            digits++;
        }
        return digits;
    }

}

class BigNumber {

    private static int DIGITS_OF_PART = 9;
    private List<Integer> numberList;

    public BigNumber() {
        this.numberList = new ArrayList<>();
    }

    public int getDigits() {
        final int size = this.numberList.size();

        int digits = (size - 1) * this.DIGITS_OF_PART;
        int highValue = this.numberList.get(size - 1);
        digits += Method.getDigits(highValue);

        return digits;
    }

    public static BigNumber parse(String valueText) {
        BigNumber number = new BigNumber();

        while (!valueText.equals("")) {
            final int size = valueText.length();
            int end = Math.min(size, BigNumber.DIGITS_OF_PART);

            final String token = valueText.substring(size - end, size);
            valueText = valueText.substring(0, size - end);
            number.numberList.add(Integer.parseInt(token));
        }

        return number;
    }

    public static BigNumber add(BigNumber a, BigNumber b) {
        BigNumber number = new BigNumber();

        int carryValue = 0;
        for (int i = 0; i < a.numberList.size() || i < b.numberList.size(); i++) {
            int value = carryValue;
            carryValue = 0;

            if (i < a.numberList.size()) {
                value += a.numberList.get(i);
            }
            if (i < b.numberList.size()) {
                value += b.numberList.get(i);
            }

            int max = (int) Math.pow(10, BigNumber.DIGITS_OF_PART);
            while (value >= max) {
                value -= max;
                carryValue++;
            }

            number.numberList.add(value);
        }

        return number;
    }

    public String toString() {
        String string = new String();
        final int max = this.numberList.size() - 1;
        for (int i = max; i >= 0; i--) {
            String format;
            if (i == max) {
                format = "%d";
            } else {
                format = "%09d";
            }
            string += String.format(format, this.numberList.get(i));
        }

        return string;
    }

}

// Not important

class Writer {
    private StringBuilder stringBuilder;
    public Writer() {
        this.stringBuilder = new StringBuilder();
    }
    public <T> void write(T text) {
        this.stringBuilder.append(text);
    }
    public void print() {
        System.out.print(stringBuilder);
    }
}
class Reader {
    private InputStreamReader inputReader;
    private BufferedReader bufferedReader;
    private StringTokenizer tokenizer;
    private String delim;
    public Reader() {
        this.inputReader = new InputStreamReader(System.in);
        this.bufferedReader = new BufferedReader(inputReader);
        this.tokenizer = new StringTokenizer("");
        this.delim = null;
    }
    public void setDelim(String delim) {
        this.delim = delim;
    }
    public boolean isReadable() throws IOException {
        try {
            checkTokenizer();
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
    public Integer readInt() throws IOException {
        final String token = read();
        if (token == null) { return null; }
        return Integer.parseInt(token);
    }
    public Double readDouble() throws IOException {
        final String token = read();
        if (token == null) { return null; }
        return Double.parseDouble(token);
    }
    public String read() throws IOException {
        if (!isReadable()) { return null; }
        if (delim == null) {
            return this.tokenizer.nextToken();
        } else {
            return this.tokenizer.nextToken(delim);
        }
    }
    private void checkTokenizer() throws IOException, NullPointerException {
        if (this.tokenizer.hasMoreTokens()) { return; }
        final String line = this.bufferedReader.readLine();
        this.tokenizer = new StringTokenizer(line);
    }
}