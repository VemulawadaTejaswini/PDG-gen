import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static int[] qlist;
	public static int[] qcnt;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int q = sc.nextInt();
		qlist = new int[q];
		qcnt = new int[q];
		for(int i = 0;i < q;i++) {
			qlist[i] = sc.nextInt();
		}
		int nowM = 0,nowC = 0,wkM,wkC;
		ArrayList<Charinfo> dlist = new ArrayList<Charinfo>();
		ArrayList<Charinfo> mlist = new ArrayList<Charinfo>();
		ArrayList<Charinfo> clist = new ArrayList<Charinfo>();
		for(int i = 0;i < n;i++) {
			if(s[i] == 'D') {
				dlist.add(new Charinfo(i));
			}
			else if(s[i] == 'M') {
				mlist.add(new Charinfo(i));
			}
			else if(s[i] == 'C') {
				clist.add(new Charinfo(i));
			}
		}
		if(dlist.size() == 0 || mlist.size() == 0 || clist.size() == 0) {
			for(int i = 0;i < q;i++) {
				System.out.println(0);
			}
		}
		MainRoop:for(int i = 0;i < dlist.size();i++) {
			while(dlist.get(i).index > mlist.get(nowM).index) {
				nowM++;
				if(nowM >= mlist.size()) {
					break MainRoop;
				}
			}
			while(mlist.get(nowM).index > clist.get(nowC).index) {
				nowC++;
				if(nowC >= clist.size()) {
					break MainRoop;
				}
			}
			SubRoop:for(int j = nowM;j < mlist.size();j++) {
				wkC = nowC;
				while(mlist.get(j).index > clist.get(wkC).index) {
					wkC++;
					if(wkC >= clist.size()) {
						break SubRoop;
					}
				}
				while(wkC < clist.size()) {
					if(wkC >= clist.size()) {
						break;
					}
					cnt(clist.get(wkC).index - dlist.get(i).index);
					wkC++;
				}

			}
		}
		for(int i = 0;i < q;i++) {
			System.out.println(qcnt[i]);
		}
	}
	public static void cnt(int sa) {
		for(int i = 0;i < qlist.length;i++) {
			if(sa < qlist[i]) {
				qcnt[i]++;
			}
		}
	}
}
class Charinfo {
	public int index;
	public Charinfo(int index) {
		this.index = index;
	}
}