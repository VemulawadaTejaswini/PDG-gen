import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for (int a=1;a<=n;a++){
			if(a%3!=0&&a%10!=3){continue;}
			System.out.print(a+" ");
		}
		System.out.println("\n");
	}
}