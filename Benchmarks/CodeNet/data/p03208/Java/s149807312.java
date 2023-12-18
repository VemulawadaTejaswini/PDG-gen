import java.util.*;

public class Main{
	public static void main(String[[] args){
    	Scanner scan = new Scanner(System.in);
      	int n= scan.nextInt();
      	int k = scan.nextInt();
      	int[] h = new int[];
     	for(int i = o; i < n; i++){
        	h[i] = scan.nextInt();
        }
      	Arrays.sort(h);
      	int ans = Integer.MAX_VALUE;
      	for(int j = 0; j < n; j++){
        	ans = Math.min(ans, h[j + k] - h[j]);
        }
      	System.out.print(ans);
    }

}