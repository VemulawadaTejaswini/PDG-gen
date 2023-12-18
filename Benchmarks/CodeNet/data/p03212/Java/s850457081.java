import java.util.*;
class Abc
{
    static int MOD = 1000000007;
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int m = n;
        int k = 0;
        while(m > 0){
            m /= 10;
            p++;
            if(m < 10 && m > 0) k = m;
        }
        int ans = 0;
        for(int i = 3; i < p; i++){
            ans += Math.pow(3, i-1) - 3 * ((int) Math.pow(2, i-1) - 2)+ 3;
        }
        if(k - 1 >= 3){
            ans += Math.pow(2, p-1) - 2;
        }
        if(k - 1 >= 5){
            ans += Math.pow(2, p-1) - 2;
        }
        if(k - 1 >= 7){
            ans += Math.pow(2, p-1) - 2;
        }
        for(int i = k *(int) Math.pow(10, p-1) + 3; i <= n; i += 2){
            if(judge(i)) ans++;
        }
        System.out.println(ans);
    }
    public  static boolean judge(int i){
        boolean b1 = false, b2 = false, b3 = false;
        while(i > 0){
            int k = i % 10;
            if(k != 3 && k != 5 && k != 7) return false;
            if(k == 3) b1 = true;
            else if(k == 5) b2 = true;
            else if(k == 7) b3 = true;
            i /= 10;
        }
        if(b1 && b2 && b3) return true;
        else return false;
    }
}