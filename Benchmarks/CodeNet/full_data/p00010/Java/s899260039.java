import java.util.Scanner;

class Main {
    public static void main(String[] z) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0) {
            double x1,y1,x2,y2,x3,y3;
            x1=sc.nextDouble();
            y1=sc.nextDouble();
            x2=sc.nextDouble();
            y2=sc.nextDouble();
            x3=sc.nextDouble();
            y3=sc.nextDouble();
            double a1=2*(x2-x1);
            double b1=2*(y2-y1);
            double c1=x1*x1-x2*x2+y1*y1-y2*y2;
            double a2=2*(x3-x1);
            double b2=2*(y3-y1);
            double c2=x1*x1-x3*x3+y1*y1-y3*y3;
            double x=(b1*c2-b2*c1)/(a1*b2-a2*b1);
            double y=(c1*a2-c2*a1)/(a1*b2-a2*b1);
            double r=Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
            System.out.printf("%.3f %.3f %.3f\n",x,y,r);
        }
    }
}


