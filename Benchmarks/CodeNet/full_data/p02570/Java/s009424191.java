import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long A[] = new long[n];
		for(int i = 0; i< n; i++) {
			A[i] = sc.nextLong();
		}
		
		long temp = 0;
		List<Long> sumList = new ArrayList<>();
		for(int i = 0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				temp += A[i]*A[j];
				if(temp>1000000007) {
					temp -= 1000000007;
				}
			}
			sumList.add(temp);
			temp = 0;
		}
		long sum = 0;
		for(int i = 0; i<sumList.size(); i++) {
			sum += sumList.get(i);
				sum %= 1000000007;
		}
		System.out.println(sum);
	}

}
