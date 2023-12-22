
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();//カードの枚数
		int[] A = new int[n];
		int[] B = new int[n];
		int[] tokuten = {0, 0};

		for(int i=0; i<n; i++){
			A[i] = s.nextInt();
			B[i] = s.nextInt();
		}
		for(int i=0; i<n; i++){
			if(A[i]==B[i]){
				tokuten[0]+=A[i];
				tokuten[1]+=B[i];
			}
			if(A[i]<B[i]){
				tokuten[1]+=A[i]+B[i];
			}else if(A[i]>B[i]){
				tokuten[0]+=A[i]+B[i];
			}
		}
		System.out.println(tokuten[0]+" "+tokuten[1]);
	}
}