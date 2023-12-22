import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double x[];
        double y[];
        double p1=0;
        double p2=0;
        double p3=0;
        double pm=0;
        double a;
        x=new double[n];
        y=new double[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            y[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            a=Math.abs(x[i]-y[i]);
            p1+=a;
            p2+=a*a;
            p3+=a*a*a;
            if(pm<a) pm=a;
        }
        System.out.println(p1);
        System.out.println(Math.sqrt(p2));
        System.out.println(Math.cbrt(p3));
        System.out.println(pm);
    }
}

