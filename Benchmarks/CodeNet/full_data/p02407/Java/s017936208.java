import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n;
		int[] ary;
		
		n=in.nextInt();
		ary = new int[n];
		
		for(int i=0; i<n; i++){
			ary[i] = in.nextInt();
		}
		for(int i=n-1; i>=0; i--){
			System.out.print(ary[i]);
			System.out.print(" ");
		}
		System.out.println();
		in.close();
	}
}