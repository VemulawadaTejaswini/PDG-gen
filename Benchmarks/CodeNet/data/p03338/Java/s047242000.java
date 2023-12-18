import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int len = scan.nextInt();
		String mozi = scan.next();
		int count = 0;
		int max = 0;

		for(int i=1;i<=len-1;i++) {

			int re = i;
			for(char c = 'a';c<='z';c++) {

				boolean left = false;
				boolean right = false;
				for(int j=0;j<re;j++) {
					if(mozi.charAt(j) == c) {
						left = true;
						break;
					}
				}
				for(int j=re;j<len;j++) {
					if(mozi.charAt(j) == c) {
						right = true;
						break;
					}
				}

				if(left && right) {
					count++;
				}
				max = Math.max(max, count);
				}
		}
		System.out.println(max);
		scan.close();
	}
}
