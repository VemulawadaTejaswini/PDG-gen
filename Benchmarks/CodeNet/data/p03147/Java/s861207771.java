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
        int H = 1;
        while(H <= max) {
            for(int i=1; i<N; i++) {
                if(h[i-1] >= H) {
                    if(h[i] >= H) {
                        if(i==N-1) {
                            count++;
                        }
                    }else {
                        count++;
                    }
                }else {
                    if(i==N-1 && h[i] >= H) {
                        count++;
                    }
                }
            }
            H++;
        }
        System.out.println(count);
        
    }
}