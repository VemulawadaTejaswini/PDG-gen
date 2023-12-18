import java.util.*;
 
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = Integer.parseInt(sc.next());
        } 
        sc.close();

        int min = Integer.MAX_VALUE, ans = 0;
        
        for(int i = 0; i < N; i++){
            min = Math.min(min, a[i]);
            if(a[i] <= min) ans++;
        }
        
        System.out.println(ans);
    }
}