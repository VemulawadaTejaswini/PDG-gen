import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();

		int p = 0;
		for (int i=0; i < s.length(); i++) {
			if(s.charAt(i) != 'B') {
				sb.append(s.charAt(p));
				p++;
			}else{
				if(sb.length() != 0){
//					System.out.println(sb);
				sb.deleteCharAt(p-1);
				p--;
				}
			}

		}



		System.out.println(sb);

		sc.close();
	}

}
