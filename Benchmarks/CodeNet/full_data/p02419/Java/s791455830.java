import java.util.Scanner;

public class Main {



	/**第二引数 の中にある 第一引数 の数を出力するプログラム
	 *
	 * @param args
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){

		String search = scan.next();
//		String search = args[0];
		int count = 0;

		for(String now_script = scan.next(); !(now_script.equals("END_OF_TEXT"));now_script = scan.next()	){
			now_script = now_script.toLowerCase();		//文章を小文字に変換する。equalsは文字の大小も判定に含むため
			if(search.equals(now_script)){
				count++;
			}
		}
		System.out.println(count);
	}


}

