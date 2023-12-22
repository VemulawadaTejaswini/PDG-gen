import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            double a[] = new double[3], b[] = new double[3];
            for(int i=0;i<3;i++) a[i] = in.nextDouble();
            for(int i=0;i<3;i++) b[i] = in.nextDouble();
            double d = det(a[0],a[1],b[0],b[1]);
            double d1 = det(a[2],a[1],b[2],b[1]);
            double d2 = det(a[0],a[2],b[0],b[2]);
            System.out.printf("%.3f %.3f\n",d1/d,d2/d);
        }
    }
    static double det(double a, double b, double c, double d){
        return a*d - b*c;
    }
}