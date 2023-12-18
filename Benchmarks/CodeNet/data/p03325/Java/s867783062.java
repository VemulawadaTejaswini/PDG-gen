import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] a = new long[N];
        long max = 0;
        int idx = 0;
        int count = 0;
        for(int i=0; i<N; i++) {
            a[i] = Long.parseLong(sc.next());
            if(a[i] > 0 && a[i] % 2 == 0){
                if(max < a[i]) {
                    max = a[i]; 
                    idx = i;
                }
            }
        }
        for(int i=0; i<N; i++) {
            if(i == idx) a[i] /= 2;
            else a[i] *= 3;
        }
        if(max != 0) {
            count = 1;
            while(true) {
                max = 0;
                for(int i=0; i<N; i++) {
                    if(a[i] > 0 && a[i] % 2 == 0) {
                        if(max < a[i]) {
                            max = a[i]; 
                            idx = i;
                        }
                    }
                }
                if(max == 0) break;
                for(int i=0; i<N; i++) {
                    if(i == idx) a[i] /= 2;
                    else a[i] *= 3;
                }
                count++;
            }
            
        }else {
            count = 0;
        }
        System.out.println(count);
    }
}
