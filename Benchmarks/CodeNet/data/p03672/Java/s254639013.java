import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		s.append(scan.next());


		for(int i=s.length()-1;i>=0;i--) {
			s.deleteCharAt(s.length()-1);

			if(s.length()%2==0) {
				String a = s.substring(0,s.length()/2-1);
				String b = s.substring(s.length()/2, s.length()-1);
				if(a.equals(b)) {
					break;
				}
			}
		}
		System.out.println(s.length());
	}

}
