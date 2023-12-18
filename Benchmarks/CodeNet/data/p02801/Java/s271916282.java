import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String c = stdIn.next();
        String d = String.valueOf((char) (c.charAt(0) + 1));
        System.out.println(d);
    }
}
