import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();

		for (int i=0; i < s.length(); i++) {
			if(s.charAt(i) != 'B') {
				sb.append(s.charAt(i));
			}else{
				if(sb.length() != 0){
				sb.deleteCharAt(i-1);
				}
			}

		}



		System.out.println(sb);

		sc.close();
	}

}
