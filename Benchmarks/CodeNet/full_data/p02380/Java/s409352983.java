import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double a,b,c,rad,s,l,h;
        a=scan.nextDouble();
        b=scan.nextDouble();
        c=scan.nextDouble();
        
        rad=Math.toRadians(c);
        
        s=(a*b*Math.sin(rad))/2;
        l=a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(rad));
        h=b*Math.sin(rad);
        
        System.out.println(s);
        System.out.println(l);
        System.out.println(h);
    }
}
