
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String str2;
		boolean result;

		while(true) {
			result=true;
			str = br.readLine();

			if(str.equals(".")) {
				break;
			}

			while(str.matches(".*\\[.*")||str.matches(".*\\(.*")||str.matches(".*\\].*")||str.matches(".*\\).*")) {
				str=str.replaceAll("[a-z]", "A");
				str=str.replaceAll(" ", "");
				str2=str.replaceAll("\\([A-Z]*\\)", "");
				str2=str2.replaceAll("\\[[A-z]*\\]", "");
				if(str2.equals(str)) {
					if(str2.matches(".*\\[.*")||str2.matches(".*\\(.*")||str.matches(".*\\].*")||str.matches(".*\\).*")) {
						result=false;
						break;
					}else {
						break;
					}
				}
				str=str2;
			}


				if(result) {
				System.out.println("yes");
				}else {
					System.out.println("no");
				}
		}
	}
}

