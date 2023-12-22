import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r;
        double S,l;
        r=sc.nextInt();
        S=r*r*Math.PI;
        l=2*r*Math.PI;
        System.out.println(S+" "+l);
    }
}

