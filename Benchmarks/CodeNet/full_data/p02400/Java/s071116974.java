import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r,S,l,pi=Math.PI;
        r=sc.nextInt();
        S=r*r*pi;
        l=2*r*pi;
        System.out.printf("%f %f",S,l);
    }
}

