import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        n = sc.nextInt();
        int A[] = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int ans = 0;
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int m = sc.nextInt();
            int ok = 0, ng = n;
            while(ng - ok > 1){
                int mid = (ok + ng) / 2;
                if(A[mid] <= m)ok = mid;
                else ng = mid;
            }
            if(A[ok] == m)ans++;
        }
        System.out.println(ans);
    }
  
}
