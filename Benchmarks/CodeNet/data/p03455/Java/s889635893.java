import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] line = new Scanner(System.in).split(" ", 2);
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        if ((a * b) % 2 == 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
