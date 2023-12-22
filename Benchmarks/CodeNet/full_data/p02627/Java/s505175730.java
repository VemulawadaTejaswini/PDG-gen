
public class Alfhabet {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		char alfabetU = 'B';
		//char alfabetL = 'a';
		
		discernAlphabetic(alfabetU);
		//discernAlphabetic(alfabetL);

		
	}
	
	private static void discernAlphabetic (char alfabet) {
		if (Character.isUpperCase(alfabet)) {
			System.out.println("A");	// 大文字
		}
		else {
			System.out.println("a");	// 小文字
		}
	}
}
