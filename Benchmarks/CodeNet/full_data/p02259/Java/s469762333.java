import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0 ; i < N; i++  ){
			A[i] = sc.nextInt();
		}
		bubbleSort(A,N);
	}

	public static void bubbleSort(int [] A,int N){
		int flag =1;
		int cnt =0;
		while(flag == 1){
			flag = 0;
			for(int j = N-1; j >= 1;j--){
				if(A[j] < A[j-1]){
					int tmp = A[j-1];
					A[j-1] = A[j];
					A[j] = tmp;
					flag =1;
					cnt++;
				}
			}
		}
		show(A);
		System.out.println(cnt);
		return ;
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