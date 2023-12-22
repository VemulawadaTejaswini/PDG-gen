import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
            double d = sc.nextDouble(), e = sc.nextDouble(), f = sc.nextDouble();
            double y = (a*f-c*d) / (a*e-b*d);
            double x = (c-b*y) / a;
            System.out.printf("%.3f %.3f\n", x, y);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}