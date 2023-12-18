import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Pair, Integer> freq  = new HashMap<>();


        Pair p;
        Pair q;
        //freq中存储的是所有pair的数量
        //比如<1,1: 5> <2, 3: 10>之类
        for(int i = 1; i<=n; i++){
            p = findPair(i);
            freq.put(p, freq.get(p)+1);
        }

        //这道题找的是首尾相等的组，因此中间的数字不重要
        //p.a = q.b, p.b = q.a
        //就是首尾相等的组，只要把这种相等的组的数量找出来加上即可
        int ans = 0;
        for(int i = 1; i <= n; i++){
            p = findPair(i);
            q = new Pair(p.b, p.a);
            ans += freq.get(q);
        }

        System.out.println(ans);
    }

    /**
     * 找到首尾对应的对
     * @param n
     * @return
     */
    public static Pair findPair(int n){
        int a = n%10;
        int b = 0;
        while(n!=0){
            b = n;
            n /= 10;
        }
        return new Pair(a, b);
    }
}

class Pair{
    int a;
    int b;

    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}