import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, a, b;
		x = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		
		String ans[] = {"delicious", "safe", "dangerous"};
		
		int ansnum = 0, tmp = b - a;
		
		if(tmp > 0 && tmp <= x)ansnum = 1;
		else if(tmp > x)ansnum = 2;
		System.out.println(ans[ansnum]);
		
	}

}
