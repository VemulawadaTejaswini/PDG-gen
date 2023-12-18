import java.util.*;
public class Main {
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
    	int N = s.nextInt();
      	int arr[][] = new int[N][3];
      	for(int i=0;i<N;i++){
        	arr[i][0] = s.nextInt();
          	arr[i][1] = s.nextInt();
          	arr[i][2] = s.nextInt();
        }
      	int ans = ans(arr,N);
      	System.out.println(ans);
    }
  	public static int ans(int[][] arr, int N){
      	if(N<=0)
          	return 0;
      	
      	for(int i=1;i<N;i++){
        	arr[i][0] += Math.max(arr[i-1][1],arr[i-1][2]);
          	arr[i][1] += Math.max(arr[i-1][0],arr[i-1][2]);
          	arr[i][2] += Math.max(arr[i-1][0],arr[i-1][1]);
        }
      	
    	int max = 0;
      	for(int k=0;k<3;k++){
        	max = Math.max(max, arr[N-1][k]);
        }
      	return max;
    }
}