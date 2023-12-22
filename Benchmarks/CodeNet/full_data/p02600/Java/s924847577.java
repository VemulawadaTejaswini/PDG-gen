
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        if (A>=1800) {
            System.out.println(1);
        } else if (A>=1600)
            System.out.println(2);
        else if (A>=1400)
            System.out.println(3);
        else if (A>=1200)
            System.out.println(4);
        else if (A>=1000)
            System.out.println(5);
        else if (A>=800)
            System.out.println(6);
        else if (A>=600)
            System.out.println(7);
        else if (A>=400)
            System.out.println(8);
    }

}
