import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();

	}
	public static boolean isContain(String s, char c){
		int len = s.length();
		for(int i = 0; i < len; i++){
			//char c1 = ;
			if(s.charAt(i) == c){
				return true;
			}
		}
		return false;

	}
	public static void doIt(){
		String right = "yuiophjklnm";
		boolean isRight = false;
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		while(s.equals("#") == false){
			int count = 0;
			int len = s.length();
			//初期化する
			if(isContain(right,s.charAt(0))){
				isRight = true;
			}
			else{
				isRight = false;
			}
			for(int i = 1; i < len; i++){
				char c = s.charAt(i);
				if(isContain(right,c)){
					if(isRight == false){
						count++;
						isRight = true;
					}
				}
				else{
					if(isRight){
						count++;
						isRight = false;
					}
				}
			}
			System.out.println(count);

			s = sc.next();
		}
	}
}