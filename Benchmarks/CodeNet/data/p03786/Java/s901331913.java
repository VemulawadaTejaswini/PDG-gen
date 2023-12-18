import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1行目の入力
		int N = sc.nextInt();
		//2行目の入力
		int[] A = new int[N];
		for(int i=0; i<N; i++){
			A[i]  = sc.nextInt();
		}
		//A[i]を並び替える
		int val;
		int j;
		for(int i=1; i<N; i++){
			val = A[i];
			j = i;
			while(j>0 && A[j-1]>val){
				A[j] = A[j-1];
				j--;
			}
			A[j] =val;
		}
		//残る種類を求める
		int count = 1;
		int temp = N;
		for(int i=N-1; i>=0; i--){
			if(A[i] > A[i-1]*2){
				temp = i;
				count  =  N-i;
				break;
			}
		}
		int sum;
		for(int i = temp-1; i>=0; i--){
			sum = 0;
			for(int k = i; k>=0; k--){
				sum += A[k];
			}
			if(sum*2>=A[i+1]){
				count++;
			}else{
				break;
			}
		}
		//出力
		System.out.println(count);

	}
	
}
