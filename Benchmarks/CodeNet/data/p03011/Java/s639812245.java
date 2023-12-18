import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		
		if (q <= p && r <= p )
			System.out.println(q + r);
		else if (p < q && r <= q)
			System.out.println(p +r);
		else if(p <= r && q < r)
			System.out.println(p + q);

		
		}
	
	}
