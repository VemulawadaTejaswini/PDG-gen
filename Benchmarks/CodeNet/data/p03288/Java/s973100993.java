
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
//        int a = 11;
//        int b = 5;
//        int c = 5;
        Scanner cin = new Scanner(System.in);
        int R = cin.nextInt();
        if (R<=1199) System.out.println("ABC");
        else if (R>1199&&R<2800) System.out.println("ARC");
        else System.out.println("AGC");
    }

}
