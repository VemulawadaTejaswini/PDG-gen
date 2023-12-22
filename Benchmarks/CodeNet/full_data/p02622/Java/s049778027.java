import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=t.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
