import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for(int i = 0; i < 5; i++){
			a[i] = sc.nextInt();
		}
		if((a[2]+a[4]) > a[0] || (a[3]+a[4]) > a[1] ||
				(a[2]-a[4]) < 0 || (a[3]-a[4]) < 0)System.out.println("No");
		else System.out.println("Yes");
}
}