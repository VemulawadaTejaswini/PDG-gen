import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a;
		a = new int[100];
		int i;
		for(i = 0; i < n; ++i){
			int r = scan.nextInt();
			a[i] = r;
		}
		for(i = n - 1; i >= 0; --i){
			if(i == 0)
				System.out.print(a[i]);
			else 
				System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}