import java.math.BigInteger;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int x = cin.nextInt();

        if(n*500>=x)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
