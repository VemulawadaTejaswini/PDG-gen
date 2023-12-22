import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] next = new int[n];
        for(int i=0; i<n; i++) {
            next[i] = sc.nextInt();
        }
        for(int i=0; i<k; i++) {
            int c = 0;
            int[] prev = next;
            int[] d = new int[n+1];
            for(int j=0; j<n; j++) {
                d[Math.max(j-prev[j], 0)]++;
                d[Math.min(j+prev[j]+1, n)]--;
            }
            next = new int[n];
            next[0] = d[0];
            for(int j=1; j<n; j++) {
                next[j] = next[j-1] + d[j];
                if(next[j] == n) c++;
            }
            if(c == n) break;
        }
        for(int i=0; i<n; i++) {
            if(i>0) System.out.print(" ");
            System.out.print(next[i]);
        }
        System.out.println();

    }
}