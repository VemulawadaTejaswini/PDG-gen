import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        long a = scn.nextLong();
        double b = scn.nextDouble();
        double b2 = Math.round(b*100);

        long B = (long)b2;

        long ans = a*B;

        long ans2 = ans/100;

        System.out.println(ans2);

        scn.close();


    }


}