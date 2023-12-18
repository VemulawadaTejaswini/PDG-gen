
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int []arr=new int [N];
		for(int k=1;k<=N-1;k++) {
			int c=sc.nextInt();
			arr[c]++;
		}
		for (int i=1 ;i<arr.length ;i++) {
			System.out.println(arr[i]);
		}
	}
}
