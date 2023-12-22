import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        long a = scn.nextLong();
        double b = scn.nextDouble();

        long B = (long)(b*100);

        long ans = a*B;

        long ans2 = ans/100;

        System.out.println(ans2);

        scn.close();


    }


}