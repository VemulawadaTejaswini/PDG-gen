import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String str = sc.nextLine();
		char sentence[] = str.toCharArray();
		
		for(int i=0; i < sentence.length; i++){
			if(Character.isLowerCase(sentence[i])){
				sentence[i] = Character.toUpperCase(sentence[i]);
			}
			else if(Character.isUpperCase(sentence[i])){
				sentence[i] = Character.toLowerCase(sentence[i]);
			}
			
			System.out.print(sentence[i]);
		}
		System.out.println();
	}

}