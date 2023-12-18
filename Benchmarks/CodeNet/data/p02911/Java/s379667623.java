
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        final int Q = sc.nextInt();
        int[] p = new int[N];
        for(int i=0;i<Q;i++){
            p[sc.nextInt()-1]++;
        }
        for(int i=0;i<N;i++){
            if(K+p[i]-Q<=0){                
                System.out.println("No");
            }else{                                
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}