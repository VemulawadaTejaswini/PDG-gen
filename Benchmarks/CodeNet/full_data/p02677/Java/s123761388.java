import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

        double Arad  = H + (double)M/60;
        double Brad = (double)M;

        double Ax = A * Math.cos(Math.toRadians(90 - Arad*30));
        double Ay = A * Math.sin(Math.toRadians(90 - Arad*30));
        double Bx = B * Math.cos(Math.toRadians(90 - Brad*6));
        double By = B * Math.sin(Math.toRadians(90 - Brad*6));
        
        System.out.println(Math.sqrt((Bx -Ax) * (Bx -Ax) + (By -Ay) * (By -Ay)));

    }

}







