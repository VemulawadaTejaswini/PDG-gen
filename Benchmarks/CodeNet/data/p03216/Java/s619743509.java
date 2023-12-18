import java.util.Scanner;
public class Main {
	public static int[] qlist;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int q = sc.nextInt();
		qlist = new int[q];
		long dcnt = 0,dmcnt = 0,cnt = 0,mcnt = 0;
		int k;
		char c;
		for(int i = 0;i < q;i++) {
			qlist[i] = sc.nextInt();
		}
		sc.close();
		for(int j = 0;j < q;j++) {
			dmcnt = 0;
			dcnt = 0;
			mcnt = 0;
			cnt = 0;
			for(int i = 0;i < n;i++) {
				k = qlist[j];
				if(i - k >= 0) {
					c = s[i-k];
					if(c == 'D') {
						dcnt--;
						dmcnt -= mcnt;
					}
					else if(c == 'M') {
						mcnt--;
					}
				}
				if(s[i] == 'D') {
					dcnt++;
				}
				else if(s[i] == 'M') {
					mcnt++;
					dmcnt += dcnt;
				}
				else if(s[i] == 'C') {
					cnt += dmcnt;
				}
			}
			System.out.println(cnt);
		}

	}
}