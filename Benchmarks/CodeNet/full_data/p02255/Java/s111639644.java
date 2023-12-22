import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N =sc.nextInt();
		int [] A = new int[N];
		for(int i=0 ; i < N; i++  ){
			A[i] = sc.nextInt();
		}
		show(A);
		for(int i =1; i < N ; i++){
			int v = A[i];
			int j = i-1;
			while(j >= 0 && A[j] > v){
				A[j+1] = A[j];
				j --;
			}
			A[j+1] = v;
			show(A)	;
			}	
	}
	public static void show(int[] A){
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < A.length; i++){
			sb.append(A[i]);
			if(i != A.length -1){
				sb.append(" ");
			}
		}
		System.out.println(sb); 
	}
	
}