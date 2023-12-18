
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());//int型
		String sline = sc.next();
		sc.close();
		String[] s1 = new String[n];
		String[] s2 = new String[n];
		for (int i=0; i<n; i++){
			s1[i] = String.valueOf(sline.charAt(i));
			s2[i] = String.valueOf(sline.charAt(i));
		}
		int ans1 = 0;
		for(int i=0; i<n-1; i++) {
			if (s1[i].equals("#")&&s1[i+1].equals(".")) { 
				s1[i+1] = "#";
				ans1++;
			}
		}
		int ans2 = 0;
		for(int i=n-1; i>0; i--) {
			if (s2[i].equals(".")&&s2[i-1].equals("#")) {
				s2[i-1] = ".";
				ans2++;
			}
		}
		System.out.println(Math.min(ans1, ans2));
	}

}
