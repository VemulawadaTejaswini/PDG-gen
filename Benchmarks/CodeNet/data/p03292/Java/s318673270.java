import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        int x1= Math.abs(a-c);
        int x2= Math.abs(b-c);
        System.out.println(x1+x2);

    }
}