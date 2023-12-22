import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int a =scan.nextInt();
        int b =scan.nextInt();
        int C =scan.nextInt();

        double radC=C*2*Math.PI/360;

        double S=a*b*Math.sin(radC)/2;
        double d=Math.sqrt(a*a+b*b-2*a*b*Math.cos(radC));
        double h=b*Math.sin(radC);
        double L=a+b+d;
        System.out.printf("%f\n",S);
        System.out.printf("%f\n",L);
        System.out.printf("%f\n",h);

    }
}

