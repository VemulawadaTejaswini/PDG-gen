public class AtCoder {

	public static void main(String[] args) {
		String S = "", T = "";
		if(S.length() + 1 == T.length()) {
			
			String TS = T.substring(0,S.length());
			if(TS.equals (S)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}else {
			System.out.println("No");
		}
	}

}
