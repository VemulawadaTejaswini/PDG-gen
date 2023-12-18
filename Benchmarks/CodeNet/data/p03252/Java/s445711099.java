import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 文字列の標準入力
		String s = sc.next();
		String t = sc.next();
		String sArray[] = new String[s.length()];
		String tArray[] = new String[t.length()];
		for(int i = 0; i < s.length(); i++) {
			sArray[i] = String.valueOf(s.charAt(i));
			tArray[i] = String.valueOf(t.charAt(i));
			for(int j = 0; j < i; j++) {
				if(sArray[j].equals(sArray[i])) {
					sArray[i] = "";
				}
				if(tArray[j].equals(tArray[i])) {
					tArray[i] = "";
				}
			}
		}
//		List<String> sList = new ArrayList<String>(Arrays.asList(sArray));
//		List<String> tList = new ArrayList<String>(Arrays.asList(tArray));
//		if(sList.contains("") == false && tList.contains("") == false) {
//			System.out.println("Yes");
//		} else {
			for(int i = 0; i < s.length(); i++) {
				if((sArray[i].equals("") || tArray[i].equals("")) && !(sArray[i].equals(tArray[i]))) {
					System.out.println("No");
					System.exit(0);
				}
			}
			System.out.println("Yes");
//		}
		sc.close();
	}
}
