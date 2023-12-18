import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean isAllPlus = true;
		boolean isAllMinus = true;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < 0) {
				isAllPlus = false;
			}
			if(arr[i] > 0) {
				isAllMinus = false;
			}
		}
		if(isAllPlus) {
			System.out.println(n-1);
			for(int i = 1; i < n; i++) {
				System.out.println(i+" "+(i+1));
			}
			return;
		}
		if(isAllMinus) {
			System.out.println(n-1);
			for(int i = n; i > 1; i--) {
				System.out.println(i+" "+(i-1));
			}
			return;
		}
		int maxNum = 0;
		int maxAbs = 0;
		for(int i = 0 ; i < n; i++) {
			if(Math.abs(arr[i]) > maxAbs) {
				maxNum = i;
				maxAbs = Math.abs(i);
			}
		}
		System.out.println(n-1+n-1);
		for(int i = 0; i < n; i++) {
			if(i!=maxNum) {
				System.out.println(maxNum+1+" "+(i+1));
			}
		}
		if(arr[maxNum] < 0) {
			for(int i = n; i > 1; i--) {
				System.out.println(i+" "+(i-1));
			}
			return;
		} else {
			for(int i = 1; i < n; i++) {
				System.out.println(i+" "+(i+1));
			}
			return;
		}
	}
}