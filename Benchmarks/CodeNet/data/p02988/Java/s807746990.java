import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++)arr[i]=sc.nextInt();
		int output = 0;
		for(int i = 1;i<n-1;i++) {
			if(arr[i]>arr[i-1]&&arr[i]<arr[i+1])output++;
			else if(arr[i]<arr[i-1]&&arr[i]>arr[i+1])output++;
		}
		System.out.println(output);

	}

}
