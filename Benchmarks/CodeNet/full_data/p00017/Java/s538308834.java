import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		while(sc.hasNextLine()){
			char sentence[] = sc.nextLine().toCharArray();
			
			for(int i=0; i < 26; i++){
				for(int j=0; j < sentence.length; j++){
					if(sentence[j] != ' ' && sentence[j] != '.'){
						sentence[j] = (char)((int)(sentence[j] - 'a' + 1) % 26 + 'a');
					}
				}
				
				String str = String.valueOf(sentence);
				if(str.indexOf("this") != -1 || str.indexOf("the") != -1 || str.indexOf("that") != -1){
					System.out.println(str);
					break;
				}
			}
			
		}

	}

}