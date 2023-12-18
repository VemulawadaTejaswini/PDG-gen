
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Text> list = new ArrayList<>();
		list.add(new Text(sc.next(), 1));
		for(int i = 1; i < n; i++) {
			String s = sc.next();
			int l = 0;
			int r = list.size();
			while(l + 1 < r) {
				int middle = (l + r) / 2;
				if(s.compareTo(list.get(middle).getS()) >= 0) {
					l = middle;
				} else {
					r = middle;
				}
			}
			if(s.equals(list.get(l).getS())) {
				list.get(l).setNum(list.get(l).getNum() + 1);
			} else {
				list.add(new Text(s, 1));
			}
			list.sort(Comparator.comparing(Text::getS));
		}
		list.sort(Comparator.comparing(Text::getNum).reversed());
		int m = list.get(0).getNum();
		List<String> ans = new ArrayList<>();
		for(Text e : list) {
			if(e.getNum() < m) {
				break;
			} else {
				ans.add(e.getS());
			}
		}
		Collections.sort(ans);
		ans.forEach(System.out::println);
	}

}

class Text {
	private String s;
	private int num;

	protected Text(String s, int num) {
		super();
		this.s = s;
		this.num = num;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}