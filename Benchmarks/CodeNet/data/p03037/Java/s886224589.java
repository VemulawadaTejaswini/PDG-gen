import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int card = scan.nextInt();
		int gate = scan.nextInt();
		int maxS = 0;
		int minE = 0;

		for(int i=0;i<gate;i++) {
			int start = scan.nextInt();
			int end = scan.nextInt();

			maxS = Math.max(maxS, start);
			minE = Math.min(minE, end);
		}

		int re = minE-maxS+1;
		System.out.println(re>0?re:0);
		scan.close();

	}

}
