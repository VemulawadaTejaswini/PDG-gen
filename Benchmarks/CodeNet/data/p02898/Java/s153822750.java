import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int result=0;
		for(int i=0;i<n;i++) {
			int hight=sc.nextInt();
			result+=k>hight?0:1;
		}
		System.out.println(result);
	}
}