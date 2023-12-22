import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String AStr[] = br.readLine().split(" ");
		int A[] = new int[n];

		for(int i = 0 ; i < n ; i++) A[i] = Integer.parseInt(AStr[i]);

		selectSort(n,A);

	}

	public static void selectSort(int n,int[] A){
		int count = 0;
		for(int i = 0 ; i < n ; i++){
			int minIndex = i;
			for(int y = i + 1 ; y < n ; y++){
				if(A[minIndex] > A[y]){
					minIndex = y;
				}
			}
			if(minIndex != i){
				int tmp = A[minIndex];
				A[minIndex] = A[i];
				A[i] = tmp;
				count++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n; i++){
			sb.append(A[i]);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
		System.out.println(count);
	}

}