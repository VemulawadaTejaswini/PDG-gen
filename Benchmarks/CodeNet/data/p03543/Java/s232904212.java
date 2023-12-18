import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		String[] s = vd.next().split("");
		int[] n = new int[4];
		for(int i=0; i<s.length; i++) n[i]=Integer.parseInt(s[i]);
		if( (n[0]==n[1] && n[1]==n[2]) || (n[1]==n[2]&&n[2]==n[3]) ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
