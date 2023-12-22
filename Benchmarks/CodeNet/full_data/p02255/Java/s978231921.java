import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++){
			a[i] = scanner.nextInt();
		}
		int count = 0;
		for(int i = 0; i < N; i++){
			int v = a[i];
			int j = i - 1;
			while(j >= 0 && v < a[j]){
				a[j+1] = a[j];
				j--;
				a[j+1] = v;
				count++;
			}
			for(int k = 0; k < N; k++){
				if(k != N-1){
					System.out.print(a[k] + " ");
				}else if(k == N-1){
					System.out.print(a[k]);
				}
			}
			System.out.println();
		}
	}
}

