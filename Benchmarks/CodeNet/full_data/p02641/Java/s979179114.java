import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();

		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}

		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		if(p.length==0){
			System.out.println(x);
			return;
		}

		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(p[i]==arr[j]) {
					arr[j]=-1;
				}
			}
		}

		int leftIdx=0;
		for (int i = x-1; i >= 0; i--) {
			if(arr[i] >= 0) {
				leftIdx =i;
				break;
			}
		}
		int rightIdx=0;
		for (int i = x-1; i < arr.length ; i++) {
			if(arr[i] >= 0) {
				rightIdx =i;
				break;
			}
		}

		if((x-1)-leftIdx <= rightIdx-(x-1)) {
			System.out.println(arr[leftIdx]);
		} else {
			System.out.println(arr[rightIdx]);

		}
	}
}