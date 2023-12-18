import java.util.*;
public class Main {
	public static void main(String[] args) {
		int N = 0;
		int T = 0;
		int A = 0;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		T = scan.nextInt();
		A = scan.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		double arr2[] = new double[N];
		
		double temp = 0;
		int address = 1;
		temp = Math.abs(T - arr[0] *0.006 -A);
		for (int i = 1; i < arr.length; i++) {
			arr2[i] = Math.abs(T - arr[i] *0.006 - A);
			if(arr2[i] < temp){
				temp = arr2[i];
				address = i + 1;
			}
		}
		System.out.println(address);
	}
}