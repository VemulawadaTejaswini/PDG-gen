import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		ArrayList<Integer> result = new ArrayList<Integer>();

		while (true) {
			String str = br.readLine();
			if ("+".equals(SubStringMid(str))) {
				result.add(Integer.parseInt(SubStringStart(str)) + Integer.parseInt(SubStringEnd(str)));
			} else if ("-".equals(SubStringMid(str))) {
				result.add(Integer.parseInt(SubStringStart(str)) - Integer.parseInt(SubStringEnd(str)));
			} else if ("*".equals(SubStringMid(str))) {
				result.add(Integer.parseInt(SubStringStart(str)) * Integer.parseInt(SubStringEnd(str)));
			} else if ("/".equals(SubStringMid(str))) {
				result.add(Integer.parseInt(SubStringStart(str)) / Integer.parseInt(SubStringEnd(str)));
			} else if ("?".equals(SubStringMid(str))) {
				for (int i = 0; i < result.size(); i++) {
					System.out.println(result.get(i));
				}
				break;
			}
		}
	}

	//?¬¬????????°???????????????????????????
	public static String SubStringStart(String str) {
		int index = str.indexOf(" ");
		return (str.substring(0, index));
	}

	//	?¬¬????????°???????????????????????????
	public static String SubStringMid(String str) {
		int index1 = str.indexOf(" ");
		int index2 = str.lastIndexOf(" ");
		return (str.substring(index1 + 1, index2));
	}

	//	?¬¬????????°???????????????????????????
	public static String SubStringEnd(String str) {
		int index = str.lastIndexOf(" ");
		return (str.substring(index + 1));
	}
}