import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] k = new int[M];
        int[] p = new int[M];
        int[][] s = new int[M][];
        for(int i=0; i<M; i++) {
            k[i] = Integer.parseInt(sc.next());
            int[] S = new int[k[i]];
            for(int j=0; j<k[i]; j++) {
                S[j] = Integer.parseInt(sc.next());
            }
            s[i] = S;
        }
        
        int ans = 0;
        for(int i=0; i<M; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        for(int i=0; i<Math.pow(2, N); i++) {
            int[] swit = new int[N]; 
            boolean hantei = true;
            for(int j=0; j<N; j++) {
                if((1&i>>j) == 1) {
                    swit[j] += 1;
                }else {
                    swit[j] += 0;
                }
            }
            
            for(int x=0; x<M; x++) {
                int count = 0;
                for(int y=0; y<k[x]; y++) {
                    if(swit[s[x][y]-1] == 1) {
                        count++;
                    }
                }
                if(count % 2 != p[x]) {
                    hantei = false;
                }
            }
            
            
            if(hantei) ans++;
        }
        System.out.println(ans);
        
    }
}
