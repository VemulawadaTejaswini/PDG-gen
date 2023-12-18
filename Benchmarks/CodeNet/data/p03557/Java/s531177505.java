import java.util.Scanner;

public class Main{

	Scanner sc =  new Scanner(System.in);

	int a = sc.nextInt();
	int A[] = new int[a];
	int B[] = new int[a];
	int C[] = new int[a];
	int X[] = new int[a];

	public static void main(String[] args){
		for(int i = 0;i < a;i++){
			A[i] = sc.nextInt();
		}
		sort(A);
		for(int i = 0;i < a;i++){
			B[i] = sc.nextInt();
		}
		sort(B);
		for(int i = 0;i < a;i++){
			C[i] = sc.nextInt();
		}
		sort(C);
		int count = 0;
		for(int i = 0;i < a;i++){
			for(int j = 0;j < a;j++){
				if(A[i] < B[j]){
					for(int l = 0;l < a;l++){
						if(B[j] < C[l]){
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}

	void sort(int X[]){		//昇順
		int min = 0;
		int max = 0;
		for(int i = 0;i<a;i++){
			for(int j=i+1;j<a;j++){
				if(X[i] > X[j]){
					max = X[i];
					X[i] =X[j];
					X[j] = max;

				}
			}
		}
	}

}
