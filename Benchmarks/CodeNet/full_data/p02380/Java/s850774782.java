import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double C=sc.nextDouble();
        double S=a*b/2*Math.sin(C*Math.PI/180);
        double d=Math.sqrt(a*a+b*b-2*a*b*Math.cos(C*Math.PI/180));
        double L=a+b+d;
        double h=S*2/a;
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}

