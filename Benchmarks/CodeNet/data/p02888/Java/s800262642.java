import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] L = new int[N];
        for(int i=0; i<N; i++) {
            L[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(L);
        int count = 0;
        for(int i=N-1; i>=2; i--) {
            for(int j=i-1; j>=0; j--) {
                for(int k=j-1; k>=0; k--) {
                    if(L[i] < L[j] + L[k]) count++;
                    else break;
                }
            }
        }
        System.out.println(count);
    }
}