import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        long[] H = new long[N+1];
        for(int i = 1; i <= N; i++) {
            H[i] = Long.parseLong(sc.next());
        }
        
        int[] isgood = new int[N+1]; //goodなら0 badなら1
        
        for(int i = 0; i < M; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            if(H[a] < H[b]) {
                isgood[a] = 1;
            }else {
                isgood[b] = 1;
            }
        }
        
        int count = 0;
        for(int i = 1; i <= N; i++) {
            if(isgood[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
        
        
        
    }
}