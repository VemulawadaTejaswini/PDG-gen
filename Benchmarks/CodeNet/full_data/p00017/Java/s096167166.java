import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			StringBuilder in = new StringBuilder(sc.nextLine());
			for(; ; ){
				if(in.indexOf("the") >= 0 || in.indexOf("this") >= 0 || in.indexOf("that") >= 0){
					System.out.println(in);
					break;
				}
				for(int i = 0; i < in.length(); i++){
					char c = in.charAt(i);
					if(Character.isLetter(c))
						in.setCharAt(i, c == 'z' ? 'a' : (char)(c+1));
				}
			}
		}
	}
}