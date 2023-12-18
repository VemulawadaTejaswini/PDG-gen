import java.util.*;


public class Main {
    static void count2017ish(int l, int r){
        int count = 0;
        for(int i = l; i <= r; i+=2){
            if(i == 1){
                continue;
            }

            int ip = (i+1)/2;
            boolean ipIsPrime = true;
            int p = 2;
            while(Math.pow(p, 2) <= ip){
                if(ip % p == 0){
                    ipIsPrime = false;
                    break;
                }
                p++;
            }
            if(ipIsPrime){
                p = 2;
                boolean iIsPrime = true;
                while(Math.pow(p, 2) <= i){
                    if(i % p == 0){
                        iIsPrime = false;
                        break;
                    }
                    p++;
                }
                if(iIsPrime){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            count2017ish(l, r);
        }

    }

    public static void main(String[] args){
        solve();
    }
}