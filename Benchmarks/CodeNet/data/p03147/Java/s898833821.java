import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] h = new int[N];
        int max = 0;
        for(int i= 0; i<N; i++) {
            h[i] = Integer.parseInt(sc.next());
            if(max < h[i]) {
                max = h[i];
            }
        }
        
        int count = 0;
        while(max > 0) {
            for(int i=1; i<N; i++) {
                if(h[i-1] == max) {
                    if(h[i] == max) {
                       if(i < N-1) {
                           h[i-1]--;
                       }else {
                           h[i-1]--;
                           h[i]--;
                           count++;
                       }
                    }else {
                        h[i-1]--;
                        count++;
                    }
                }else {
                    if(i == N-1 && h[i] == max) {
                        h[i]--;
                        count++;
                    }
                }
            }
            max--;
        }
        System.out.println(count);
        
    }
}