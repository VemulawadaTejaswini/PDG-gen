import java.io.IOException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int orderNum = scan.nextInt();
		int a = 0;
		int b = 0;

		for (int i = 0; i < orderNum; i++){
			String order = scan.next();

			if (order.equals("print")){
				a = scan.nextInt();
				b = scan.nextInt();

				String printResult = str.substring(a, b + 1);
				System.out.println(printResult);
			}

			if (order.equals("reverse")){
				a = scan.nextInt();
				b = scan.nextInt();

				String strReverse = str.substring(a, b);
				char[] strChara = new char[strReverse.length()];

				for (i = 0; i < strChara.length;i++){
					char tmp = strChara[i];
					strChara[i] = strChara[i + 1];
					strChara[i + 1] = tmp;
				}
				str = strChara.toString();
			}

			if (order.equals("replace")){
				a = scan.nextInt();
				b = scan.nextInt();
				String strReplaceWord = scan.next();

				String strReplaceTarget = str.substring(a, b);
				String strReplace = strReplaceTarget.replace(strReplaceTarget, strReplaceWord);

				str = strReplace.concat(str);
			}
		}
		scan.close();
	}
}