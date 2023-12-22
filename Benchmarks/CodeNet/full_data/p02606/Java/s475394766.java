import java.util.*;

public class Main {

    public static void main(String args[])  {


        Scanner scan = new Scanner(System.in);

        int l = scan.nextInt();
        int r = scan.nextInt();
        int d = scan.nextInt();

        int a = l / d;
        int b = r / d;

        System.out.println(b - a);
    }


}