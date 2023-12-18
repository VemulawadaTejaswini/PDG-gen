import java.util.*;
import java.math.*;
class Main {
    //
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Drink> d = new ArrayList<Drink>();
        for(int i = 0;i < n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Drink t = new Drink(a,b);
            d.add(t);
        }
        Collections.sort(d,(a, b)->Integer.compare(a.money,b.money));
        int count = 0;
        BigInteger ans = BigInteger.ZERO;
        while(m > 0){
            Drink drink = d.get(count);
            count++;
            ans = ans.add(drink.sum);
            m -=drink.number;
            BigInteger tmp = BigInteger.valueOf(m*drink.money);
            if(m < 0)ans = ans.add(tmp);
        }
        System.out.println(ans);
    }
}
class Drink{
    public int money;
    public int number;
    public BigInteger sum;
    Drink(int a,int b){
        this.money = a;
        this.number = b;
        this.sum = BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
    }
}