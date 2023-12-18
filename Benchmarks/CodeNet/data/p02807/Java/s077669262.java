import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9) + 7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            li.add(sc.nextInt());
        }
        Collections.sort(li);
        double ans = 0;
        for(int i = 0; i < n-1; i++){
            double mag = 0;
            for(int j = i+1; j < n; j++){
                mag = Math.pow(2,j-i);
                System.out.println(i +" "+j+" "+mag);
                ans += ((li.get(j)-li.get(i))/mag);
            }
            System.out.println(i +" "+mag);
            ans += ((li.get(n-1)-li.get(i))/mag);
        }
        double div = fact(n);
        System.out.println((long)((ans*div))%mod);
    }
    
    public static double fact(int n){
        long mod = (long)Math.pow(10,9) + 7;
        System.out.println(mod);
        long ret = 1;
        for(int i = 2; i < n; i++){
            ret *= i;
            ret %= mod;
        }
        return ret;
    }
}

