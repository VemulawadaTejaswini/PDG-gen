import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        System.out.printf("%.5f %.5f\n",(double)(r*r)*Math.PI,(double)(2*r)*Math.PI);
    }
}

