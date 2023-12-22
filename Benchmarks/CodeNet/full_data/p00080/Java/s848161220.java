import java.util.*;

public class Main{

    double q;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            q = sc.nextDouble();
            if(q==-1) break;

            double q2 = q/2.0;
            double qq = q2*q2;
            double qqq = qq*q2;
            double x = q2-(qqq-q)/3*qq;
            while((double)Math.abs(x*x*x-q)>=(double)0.0001*q){
                x = x - (x*x*x-q)/(3*x*x);
            }

            System.out.printf("%.6f\n",x);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}