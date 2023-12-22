import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String input = sc.nextLine();
			System.out.println(countSubstring(input, "JOI"));
			System.out.println(countSubstring(input, "IOI"));
		}
		
	}

	
	/**
	 * テ」ツ?づ」ツつ鬼tringテ」ツ?ョテ、ツクツュテ」ツ?ォテ・ツ青ォテ」ツ?セテ」ツつ古」ツつ凝・ツ按・テ」ツ?ョStringテ」ツ?ョテ・ツ?凝ヲツ閉ーテ」ツつ津ヲツ閉ーテ」ツ?暗」ツ?セテ」ツ??
	 * @param str テヲツ篠「テァツエツ「テ・ツッツセティツアツ。テ」ツ?ョテヲツ鳴?
	 * @param q テヲツ閉ーテ」ツ?暗」ツ?淌」ツ??ィツヲツ?ァツエツ?
	 * @return
	 */
	static int countSubstring(String str, String q) {
		int result = 0;
		String ss = null;
		for(int i = 0; i < str.length() - 2; i++) {
			ss = str.substring(i, i+3);
			if(ss.equals(q)) result++;
		}
		return result;
	}
	
	
	
}