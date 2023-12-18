import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		int list[] = new int[N+1];

		for (int i = 0; i < N ; i ++){
			arr[i] = scan.nextInt();
			list[arr[i]] += 1;
		}

		for(int k = 0; k < N ; k ++){
			int num = arr[k];
			int sum = 0;
			list[num] -= 1;
			for(int i = 0; i < N; i ++){
				if (list[i] > 1 ){
					for (intj = list[i]-1; j > 0; j-- ){
						sum += j ;
					}
				}	
			}
			System.out.println(sum);
			list[num] += 1;
		}
	}
}