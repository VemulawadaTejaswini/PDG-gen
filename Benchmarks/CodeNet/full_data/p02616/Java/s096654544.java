
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        ArrayList<Long> p = new ArrayList<>();
        ArrayList<Long> m = new ArrayList<>();
        int plus = 0, minus = 0, zero = 0;
        int a;
        for(int i=0;i<n;i++){
            a = sc.nextInt();
            if(a == 0){
                zero++;
            }else if(a > 0){
                p.add((long)a);
                plus++;
            }else{
                m.add((long)a);
                minus++;
            }
        }
        Collections.sort(p);
        Collections.sort(m);
        if(zero != 0 && k > plus + minus) {   //0が絶対に入るとき
            System.out.println(0);
        }else if(zero != 0 && k == plus + minus){
            if(minus % 2 == 0){
                long ans = 0;
                for(Long pl : p){
                    ans *= pl;
                    ans %= 1000000007;
                }
                for(Long mn : m){
                    ans *= mn;
                    ans %= 1000000007;
                }
                ans += 1000000007;
                ans %= 1000000007;
                System.out.println(ans);
            }else {
                System.out.println(0);
            }
        }else if(p.size() == 0){    //正の数がない時
            long ans = 1;
            if(k % 2 == 1) {    //奇数回掛けると負になるので小さい順に
                for (int i = 0; i < k; i++) {
                    ans *= m.get(m.size() - 1 - i);
                    ans %= 1000000007;
                }
            }else{      //偶数回掛けると正になるので大きい順に
                for (int i = 0; i < k; i++) {
                    ans *= m.get(i);
                    ans %= 1000000007;
                }
            }
            ans += 1000000007;
            ans %= 1000000007;
            System.out.println(ans);
        }else{
            long ans = 1;
            if(k % 2 == 1){     //奇数回掛ける時、正の数のうち最大のものは必ず使う
                ans *= p.get(p.size()-1);
                p.remove(p.size()-1);
                k--;
            }
            for(int i=0;i<k/2;i++){
                if(m.size() < 2 || (p.size() >= 2 && p.get(p.size()-1) * p.get(p.size()-2) > m.get(0) * m.get(1))){
                    ans *= p.get(p.size()-1);
                    ans %= 1000000007;
                    ans *= p.get(p.size()-2);
                    ans %= 1000000007;
                    p.remove(p.size()-1);
                    p.remove(p.size()-1);
                }else{
                    ans *= m.get(0);
                    ans %= 1000000007;
                    ans *= m.get(1);
                    ans %= 1000000007;
                    m.remove(0);
                    m.remove(0);
                }
            }
            System.out.println(ans);
        }
    }
}
