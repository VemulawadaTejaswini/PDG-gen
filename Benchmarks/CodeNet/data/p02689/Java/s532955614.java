import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt(), M = sc.nextInt();
        int[] H = new int [N];
        for (int i=0; i<N; i++) {
        	H[i] = sc.nextInt();
        }
        int[] array = new int [N];
        for (int i=0; i<M; i++) {
            int a = sc.nextInt()-1, b = sc.nextInt()-1;
            array[a] = Math.max(array[a],H[b]);
            array[b] = Math.max(array[b],H[a]);
        }
        int ans = 0;
        for (int i=0; i<N; i++) {
            ans += (H[i] > array[i])?1: 0;
        }
      sc.close();
        System.out.println(ans);
	}
}