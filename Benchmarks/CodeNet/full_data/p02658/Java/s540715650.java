import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    
    static boolean contains(long e, long[] array){
        for(int i=0; i<array.length; i++){
            if(array[i]==e) return true;
        }
        return false;
    }

    static long mults(long[] array){
        if(contains(0, array)) return 0;
        long ans = 1;
        for(int i=0; i<array.length; i++){
            if(ans > 1 + 1000000000000000000L / array[i]) return -1;
            ans *= array[i];
        }
        return ans > 1000000000000000000L ? -1 : ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for(int n=0; n<N; n++) A[n]=sc.nextLong();
        System.out.println(mults(A));
    }
}
