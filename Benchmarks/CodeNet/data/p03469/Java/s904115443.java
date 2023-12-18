import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Integer m = sc.nextInt();
		Integer p = sc.nextInt()/1000;

		Integer man = -1;
		Integer go = -1;
		Integer sen = -1;

		boolean judge = true;
		int i=0;
		do {
			int j=0;
			do {
				Integer tp = 5 * j + 1 * (m-i-j);
				if (tp == p - i * 10) {
					man = i;
					go = j;
					sen = m-i-j;
					judge = false;
				}
				j++;
//				System.out.println(String.valueOf(j));
			} while(j<=m-i && judge);
			i++;
		} while(i<=m && judge);

		String result = man.toString() + " " + go.toString() + " " + sen.toString();
		// 出力
		System.out.println(result);
	}
}