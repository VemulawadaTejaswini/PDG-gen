import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums  =new int[n];
		bubbleSort(nums);
	}
	public static void bubbleSort(int[] A){
		for(int i=0;i<N;i++){
			for(int j=1;j<N-i;j++){
				if(A[j]<A[j-1]){
					int t = A[j];
					A[j] = A[j-1];
					A[j-1] = t; 
				}
			}
		}
	}
}