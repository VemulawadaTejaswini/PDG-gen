import java.util.*;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int max = 0;
		for(int i = 0; i < n-1; i++){
			if(arr[i+1] <= arr[i]){
				count++;
			}
		}

	}

}