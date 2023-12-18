import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long value = sc.nextLong();
		long sum = sc.nextLong();
		long m = 0;
		long eat = 0;

		long[] arr = new long[(int) value];
		for(int i = 0; i< arr.length; i++){
			arr[i] = sc.nextLong();
		}
		sc.close();
		for(int i=0; i <arr.length-1;i++){
			if(arr[i] + arr[i+1] >sum){
				m = arr[i+1];
				arr[i+1] = sum - arr[i];
				eat += m - arr[i+1];
			}
		}
		System.out.println(eat);
	}
}
