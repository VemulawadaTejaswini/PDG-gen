import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	int[] W = new int[N];
      	int[] ans = new int[N];
      	for(int i = 0 ; i < N; i++){
        	W[i] = scan.nextInt();
        }
      	for(int t = 0; t < N; t++){
           int s1 = 0;
           int s2 = 0;
        	for(int j = 0; j < t; j++){
            	s1 = s1 + W[j];
              	s2 = s2 + W[j + t];
            }
          	ans[t] = Math.abs(s1-s2);
        }
      	Arrays.sort(ans);
    	System.out.print(ans[0]);
    }

}