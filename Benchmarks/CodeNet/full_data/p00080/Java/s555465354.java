import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static double q;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }

    static boolean read(){
        q = sc.nextDouble();
        if(q == -1.0)return false;
        return true;
    }

    static void solve(){
        double x = q/2;
        while(Math.abs(x*x*x - q) > 0.00001*q){
            x = x - ((x*x*x) - q)/(3*x*x);
        }
        System.out.printf("%.6f\n", x);
    }
}