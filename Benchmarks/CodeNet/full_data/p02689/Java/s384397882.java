import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        boolean[] bo = new boolean[n];
        int ans = 0;
        for(int i = 0; i < n; i++){
        	h[i] = sc.nextInt();
            bo[i] = true;
        }
        for(int i = 0; i < m; i++){
        	int a = sc.nextInt();
            int b = sc.nextInt();
            if(h[a - 1] <= h[b - 1]){
            	bo[a - 1] = false;
            }
            if(h[a - 1] >= h[b - 1]){
            	bo[b - 1] = false;
            }
        }
        for(int i = 0; i < n; i++){
        	if(bo[i] == true){
            	ans++;
            }
        }
        System.out.println(ans);
	}
}