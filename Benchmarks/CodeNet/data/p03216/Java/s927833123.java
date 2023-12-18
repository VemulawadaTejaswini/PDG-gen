import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static int[] qlist;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int q = sc.nextInt();
		ArrayList<Integer> dindex = new ArrayList<Integer>();
		qlist = new int[q];
		int dcnt = 0,mcnt = 0,dmcnt = 0,dpoint = 0,cnt = 0;
		boolean dflag = false,dmflag = false;
		for(int i = 0;i < q;i++) {
			qlist[i] = sc.nextInt();
		}
		for(int j = 0;j < q;j++) {
			cnt = 0;
			dmcnt = 0;
			dcnt = 0;
			dpoint = 0;
			dflag = false;
			dmflag = false;
			for(int i = 0;i < n;i++) {
				if(s[i] == 'D') {
					dindex.add(i);
					dcnt++;
					dflag = true;
				}
				else if(s[i] == 'M' && dflag == true) {
					dmcnt += dcnt;
					dmflag = true;
				}
				else if(s[i] == 'C' && dmflag == true) {
					if(i - dindex.get(dpoint) >= qlist[j]) {

						dpoint++;
						dmcnt -= dcnt;
						dcnt--;
						if(dmcnt == 0) {
							dmflag = false;
							dflag = false;
						}
					}
					cnt += dmcnt;
				}
			}
			System.out.println(cnt);
		}

	}
}