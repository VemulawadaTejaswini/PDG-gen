import java.util.*;
 
public class Main {
	
  	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int result = a[N-1] - a[0];
        for(int i = 0; i < N - K; i++){
            result = Math.min(result, a[K + i - 1] - a[i]);
        }
        
        System.out.println(result);
    }
}