import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int d1 = Math.abs((a+b)-(c+d));
        int d2 = Math.abs((a+c)-(b+d));
        int d3 = Math.abs((a+d)-(b+c));

        System.out.println(Math.min(Math.min(d1,d2), d3));
    }

}

