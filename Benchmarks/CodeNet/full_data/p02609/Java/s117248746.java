import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    static int popcount(int X){
        int p = 0;
        for(int i=0; i<30; i++) if((X & (1<<i)) != 0) p++;
        return p;
    }
    static int calc(int X, Map<Integer,Integer> result){
        if(result.containsKey(X)) return result.get(X);
        else{
            int next = X % popcount(X);
            int less = calc(next, result);
            result.put(X, 1+less);
            return 1+less;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt(2);

        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 0);

        for(int n=1; n<=N; n++){
            int Xi = X ^ (1 << (N-n));
            System.out.println(calc(Xi, result));
        }
        
    }
}
