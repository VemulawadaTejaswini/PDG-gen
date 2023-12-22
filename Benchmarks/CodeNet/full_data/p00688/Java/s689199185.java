import java.util.Scanner;

public class Main {
    final int MAX_VAL = 10000;
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            String ans = "Impossible";
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if((a|b|c) == 0){
                break;
            }
            int D = sqrt(b * b - 4 * a * c);
            if(D != -1){
               int n = b + (b >= 0 ? D: -D);
               int m = b + (b > 0 ? -D: D);
               int g = gcd(Math.abs(2*a),Math.abs(n));
               int p = (2 * a) / g;//約分
               int q = n / g;
               g = gcd(Math.abs(2*a),Math.abs(m));
               int r = a / p;
               int s = c / q;
               if(p > r || (p == r && q >= s)){
                   ans = p + " " + q + " " + r + " " + s;
               }
               else{
                   ans = r + " " + s + " " + p + " " + q;
               }
            }
            System.out.println(ans);
        }
    }
    int sqrt(int d){
        if(d < 0){
            return -1;
        }
        int ret = -1;
        int left = 0;
        int right = MAX_VAL + 1;
        while(right - left >= 1){
            int mid = (left + right) / 2;
            //System.out.println(left +" " + mid + " " + right);
            if(mid * mid == d){
                ret = mid;
                break;
            }
            if(mid * mid < d){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return ret; 
    }
    int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args){
        new Main().run();
    }
}