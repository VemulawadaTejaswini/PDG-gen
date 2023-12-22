import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        BigInteger money = new BigInteger("1000");
        BigInteger stock = new BigInteger("0");
        for (int i=0;i<n-1;i++){
            if (a[i]<a[i+1]){
                stock = money.divide(new BigInteger(Integer.toString(a[i])));
                money = money.remainder(new BigInteger(Integer.toString(a[i])));
            }else {
                money = money.add(stock.multiply(new BigInteger(Integer.toString(a[i]))));
                stock=new BigInteger("0");
            }
        }
        money=money.add(stock.multiply(new BigInteger(Integer.toString(a[n-1]))));;
        System.out.println(money);
    }
}
