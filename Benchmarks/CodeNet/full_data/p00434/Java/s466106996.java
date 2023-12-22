import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[31];
		int data = 0;
		for(int i = 0 ; i < 28 ; i ++){
			data=scan.nextInt();
			a[data]=data;
		}
		for(int i = 1 ; i < 31; i ++){
			if(a[i]==0)
				System.out.println(i);
		}
	}
}