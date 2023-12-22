import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double S,L,h;
        double a1=a*a;
        double b1=b*b;
        double R=b1+a1;
        double k=Math.sqrt(R);
         
        double deg1 = c;
        double rad1 = Math.toRadians(deg1);
        double Z1= Math.cos(rad1);
        double E=a1+b1-2*a*b*Z1;
        double e=Math.sqrt(E);
         
         
        double deg = c;
        double rad = Math.toRadians(deg);
        double Z= Math.sin(rad);
        S=a*b*Z/2;
        L=a+b+e;
        h=b*Z;
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}
