import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt();	
		sc.close();
		int tmpn = n / 500;
		tmpn = n - tmpn * 500;
		String ans[] = {"Yes", "No"};
		int an = 0;
		if(tmpn > a)an = 1;
		System.out.println(ans[an]);
	}

}
