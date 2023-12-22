import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String p = scan.nextLine();
		if(ringJad(s, p)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

	/**
	 * ringJad
	 * ?????????s???????????????p???????????????????????????
	 * @param s
	 * @param p
	 * @return 
	 */
	static boolean ringJad(String s, String p){
		Boolean jad = true;
		while(true){
			if(s.length() <= p.length()) s += s; break;
		}
		s += s;
		if(!(s.indexOf(p) >= 0)){
			jad = false;
		}
		return jad;
	}

}