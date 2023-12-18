import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        
        long[] a = new long[N];

        int x4 = 0;
        int ki = 0;
        for(int i=0; i<N; i++) {
            a[i] = Long.parseLong(sc.next());
            if(a[i] % 4 == 0) {
                x4++;
            }else if(a[i] % 2 == 0) {
                continue;
            }else {
                ki++;
            }
        }
        if(x4 >= ki) System.out.println("Yes");
        else System.out.println("No");
        
        
    }
}
