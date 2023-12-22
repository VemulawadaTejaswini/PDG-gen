import java.util.Scanner;

public class Main {
	public static void main(String[] args){;
	int[] a = new int[10000];
	Scanner sc = new Scanner(System.in);
	a[0]=sc.nextInt();
		for(int i=0;a[i] !=0;i=i+1){
			a[i+1] = sc.nextInt();
			System.out.println("Case "+(i+1)+": "+a[i]);
		}
	}
}