import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] result = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < 26; j++) {
				if(str.charAt(i) == DEFchar[j]) result[i] = ABCchar[j]; 
			}
		}
		
		String result_str = new String(result);
		
		System.out.println(result_str);
		
	}

	static final String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static final String DEF = "DEFGHIJKLMNOPQRSTUVWXYZABC";
	
	static final char ABCchar[] = ABC.toCharArray();
	static final char DEFchar[] = DEF.toCharArray();
}