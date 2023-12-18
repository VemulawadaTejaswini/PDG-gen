import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] spot = new int[n];
        for(int i = 0; i < n; i++){
        	spot[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
        	long total = 0;
            long now = 0;
            for(int j = 0; j < n; j++){
            	if(i != j){
                	if(now <= spot[j]){
                    	total += spot[j] - now;
                    }else{
                    	total += now - spot[j];
                    }
                    now = spot[j];
                }
                if(i != n - 1 && j == n - 1){
                	total += Math.abs(spot[j]);
                }else if(i == n - 1 && j == n - 2){
                	total += Math.abs(spot[j]);
                }
            }
            System.out.println(total);
        }
	}
}