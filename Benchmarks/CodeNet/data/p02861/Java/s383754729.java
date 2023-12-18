
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	public static boolean nextPermutation(int[] arr) {
		
		int i = arr.length-1;
		
		while (i > 0 && arr[i-1] > arr[i]) {
			--i;
		}
		
		if (i == 0) return false;
		
		int j = arr.length - 1;
		int head = arr[i-1];
		while (j > i && arr[j] < head) {
			--j;
		}
		
		int tmp = arr[i-1];
		arr[i-1] = arr[j];
		arr[j] = tmp;
		
		j = arr.length - 1;
		
		while (i < j) {
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			++i;
			--j;
		}
		
		
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[N];
		int[][] input = new int[N][];
		double fact = 1;
		
		for (int i=0; i<N; ++i) {
			arr[i] = i+1;
			fact *= (i+1);
			input[i] = new int[N];
			
			for (int j=0; j<2; ++j) {
				input[i][j] = sc.nextInt();
			}
		}
		
		double sum = 0;
		double avg = 0;
	
		do {
			
			int[] now = input[arr[0]-1];
			int x1 = now[0];
			int y1 = now[1];
			for (int cur=1; cur < N; ++cur) {
				
				now = input[arr[cur]-1];
				int y2 = now[1];
				int x2 = now[0];
				
				int left = (y2-y1) * (y2-y1);
				int right = (x2-x1) * (x2- x1);
				sum += Math.sqrt(left + right);
				
				x1 = x2;
				y1 = y2;
			}
			
		}while(nextPermutation(arr));
		
		System.out.printf("%.10f\n",sum / fact);
		
		sc.close();

	}

}
