import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int sum = sc.nextInt();
		int m = 0;
		int eat = 0;

		int[] arr = new int[value];
		for(int i = 0; i< arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i <arr.length-1;i++){
			if(arr[i] + arr[i+1] >sum){
				m = arr[i+1];
				arr[i+1] = sum - arr[i];
				eat += m - arr[i+1];
			}
		}
		System.out.println(eat);
		sc.close();
	}
}
