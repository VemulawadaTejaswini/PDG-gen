import java.util.*;


class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String S  = sc.next();
		//S は"2017/01/dd"
		
		String S2 = "2018" + S.substring(4);
		System.out.println(S2);
	}
}
