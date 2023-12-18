import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String S = s.next();
		int count = 0;
		for(int i=0;i<N-1;i++) {
			if(S.charAt(i) == '#' && S.charAt(i+1) == '.') {
				count++;
			}
		}

		System.out.printf("%d",count);
		s.close();
	}

}