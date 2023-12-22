import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int orderNum = Integer.parseInt(br.readLine());
		
		int a = 0;
		int b = 0;

		for (int i = 0; i < orderNum; i++){
			String[] order = br.readLine().split(" ");
			
			if (order[0].equals("print")) {
				order[1] = br.readLine();
				order[2] = br.readLine();

				a = Integer.parseInt(order[1]);
				b = Integer.parseInt(order[2]);

				String printResult = str.substring(a, b - 1);
				System.out.println(printResult);
			}

			if (order[0].equals("reverse")){
				order[1] = br.readLine();
				order[2] = br.readLine();

				a = Integer.parseInt(order[1]);
				b = Integer.parseInt(order[2]);

				String strReverse = str.substring(a, b);
				char[] strChara = new char[strReverse.length()];

				for (i = 0; i < strChara.length;i++){
					char tmp = strChara[i];
					strChara[i] = strChara[i + 1];
					strChara[i + 1] = tmp;
				}
				str = strChara.toString();
			}

			if (order[0].equals("replace")){
				order[1] = br.readLine();
				order[2] = br.readLine();
				order[3] = br.readLine();

				a = Integer.parseInt(order[1]);
				b = Integer.parseInt(order[2]);

				String strReplaceTarget = str.substring(a, b);
				String strReplace = strReplaceTarget.replace(strReplaceTarget, order[3]);
				str = strReplace;
			}
		}
	}
}