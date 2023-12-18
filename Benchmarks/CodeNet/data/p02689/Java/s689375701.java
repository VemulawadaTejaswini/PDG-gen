import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i = 0; i < n; i++){
        	h[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
        	a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
        	boolean bo = true;
            for(int j = 0; j < m; j++){
            	if(a[j] == i + 1){
                	if(h[i] <= h[b[j] - 1]){
                    	bo = false;
                        break;
                    }
                }else if(b[j] == i + 1){
                	if(h[i] <= h[a[j] - 1]){
                    	bo = false;
                        break;
                    }
                }
            }
            if(bo){
            	ans++;
            }
        }
        System.out.println(ans);
	}
}