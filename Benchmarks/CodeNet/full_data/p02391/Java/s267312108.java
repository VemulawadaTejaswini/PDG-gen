import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        System.out.print("a ");
        if (a > b) {
            System.out.print(">");
        } else if (a < b) {
            System.out.print("<");
        } else {
            Ssytem.out.print("==");
        }
        System.out.println(" b");
    }
}