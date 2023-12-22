import java.util.*;

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
                for(int p = a; p * p >= a; p--){
                    if(a % p != 0){
                        continue;
                    }
                    int r = a / p;                
                    int Q = b + D;
                    int S = b - D;
                    if(Q % (2 * r) == 0 && S % (2 * p) == 0){
                        ans = p + " " + Q /(2 * r) + " " + r + " " + S / (2 * p);
                        break;
                    }
                    if(S % (2 * r) == 0 && Q % (2 * p) == 0){
                        ans = p + " " + S /(2 * r) + " " + r + " " + Q / (2 * p);
                        break;
                    }
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
    public static void main(String[] args){
        new Main().run();
    }
}