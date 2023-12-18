import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		// Problem C
		int n = sc.nextInt();
		TreeSet<Integer> s = new TreeSet<Integer>();
		int first = 0;
		int second = 0;
		for(int i=0;i<n;i++) {
			int tmp = sc.nextInt();
			if (s.contains(tmp)) {
				if(tmp >= first) {
					second = first;
					first = tmp;
					s.remove(tmp);
				} else if (tmp >= second) {
					second = tmp;
					s.remove(tmp);
				}
			} else {
				s.add(tmp);
			}
		}
		System.out.println((long)first * (long)second);
	}

}
