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
            if(N == 1) {
                count = h[0];
                break;
            }
            for(int i=1; i<N; i++) {
                if(i<N-1) {
                    if(h[i-1] == max) {
                        h[i-1]--;
                        if(h[i] != max) {
                            count++;
                        }
                    }
                }else {
                    if(h[i-1] == max) {
                        h[i-1]--;
                        count++;
                        if(h[i] == max) {
                            h[i]--;
                        }
                    }else {
                        if(h[i] == max) {
                            count++;
                            h[i]--;
                        }
                    }
                }
            }
            max--;
        }
        System.out.println(count);
        
    }
}