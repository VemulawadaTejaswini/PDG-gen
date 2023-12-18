import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        long[] map = new long[3*N];
        for (int i = 0; i < N*3; i++) {
        	map[i] = sc.nextLong();
        }
        
        Arrays.sort(map);
        
        long ans = 0;
        for (int i = N; i < N*2; i++) {
        	ans += map[i];
        }
        System.out.println(ans);
    }
}
