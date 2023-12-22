public class Main {

    public static void main(String[] args) {
        final String line = readLine();
        System.out.println(calc(line));
    }

    protected static Answer calc0(String input) {
        double r = Double.parseDouble(input);

        Answer answer = new Answer();

        answer.area = r * r * Math.PI;
        answer.circumference =  (r + r) * Math.PI;

        return answer;
    }

    protected static String calc(String input) {
        return String.valueOf(calc0(input));
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

    static class Answer {
        double area;
        double circumference;
        java.text.Format df = new java.text.DecimalFormat("0.000000");

        @Override
        public String toString() {
            return df.format(area) + " " + df.format(circumference);
        }
    }
}