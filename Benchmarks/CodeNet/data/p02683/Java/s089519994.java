import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int c[] = new int[n];
        int a[][] = new int[n][m];
        int min;
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
        	for(int j = 0; j < m; j++){
            	a[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < 1 << n; i++){
            int sum[] = new int[m];
            boolean bl = true;
            int cost = 0;
        	for(int j = 0; j < n; j++){
                if((1 & i >> j) == 1){
                	for(int k = 0; k < m; k++){
                    	sum[k] += a[j][k];
                    }
                    cost += c[j];
                }
            }
            for(int j = 0; j < m; j++){
            	if(sum[j] < x){
                	bl = false;
                	break;
                }
            }
            if(bl){
            	ans.add(cost);
            }
        }
        if(ans.isEmpty()){
        	System.out.println(-1);
        }else{
        	Collections.sort(ans);
            System.out.println(ans.get(0));
        }
    }
}