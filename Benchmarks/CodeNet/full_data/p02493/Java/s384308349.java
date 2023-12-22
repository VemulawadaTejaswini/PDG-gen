import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n > 0 && n <= 100) {
			int arr[] = new int[n];
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=n-1; i>0; i--) {
					System.out.print(arr[i]+" ");
			}
			System.out.println(arr[0]);
		}
	}
}