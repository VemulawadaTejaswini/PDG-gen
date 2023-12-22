import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		char[]s = sc.next().toCharArray();
		for(int i=0;i<s.length;i++){
			s[i] = (char)(((s[i]-'A')-3+26)%26 + 'A');
		}
		System.out.println(s);
	}

}