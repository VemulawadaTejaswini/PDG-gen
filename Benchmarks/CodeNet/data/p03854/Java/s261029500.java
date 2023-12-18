import java.util.Scanner;

// https://atcoder.jp/contests/abc049/tasks/arc065_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		String[] divine = {"dream","dreamer","erase","eraser"};

		int number5 = 5;
		int number6 = 6;
		int number7 = 7;
		int switchNumber = -1;
		boolean flag = true;

		do {
			if(str.equals("")) {
				switchNumber =1;
			} else if(str.length()<=4) {
				switchNumber =2;
			} else if(str.length()<=5) {
				switchNumber =3;
			}else if(str.length()<=6) {
				switchNumber =4;
			}else if(str.length()<=7) {
				switchNumber =5;
			}

			switch (switchNumber) {
			case 1:
				System.out.println("YES");
				flag = false;
			    break;
			case 2:
				System.out.println("NO");
				flag = false;
			    break;
			case 3:
				String str5 = str.substring(str.length() - number5);
				if(str5.equals(divine[0])||str5.equals(divine[2])) {
					str = str.substring(0,str.length() - number5);
				}else {
					flag = false;
				}
			    break;
			case 4:
				String str6 = str.substring(str.length() - number6);
				if(str6.equals(divine[3])) {
					str = str.substring(0,str.length() - number6);
				}else {
					flag = false;
				}
			    break;
			case 5:
				String str7 = str.substring(str.length() - number7);
				if(str7.equals(divine[1])) {
					str = str.substring(0,str.length() - number7);
				}else {
					flag = false;
				}
			    break;
			default:
			    // 式の値がどのcaseの値とも一致しなかったときの処理
				str5 = str.substring(str.length() - number5);
				str6 = str.substring(str.length() - number6);
				str7 = str.substring(str.length() - number7);
				if(str5.equals(divine[0])) {
					str = str.substring(0,str.length() - number5);
				}else if(str7.equals(divine[1])) {
					str = str.substring(0,str.length() - number7);
				}else if(str5.equals(divine[2])) {
					str = str.substring(0,str.length() - number5);
				}else if(str6.equals(divine[3])) {
					str = str.substring(0,str.length() - number6);
				}else {
					flag = false;
					System.out.println("NO");
				}
			}
		}while(flag);
	}

}
