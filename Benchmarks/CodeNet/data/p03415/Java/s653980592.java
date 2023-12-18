import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[3];
		
		for(int i = 0 ; i < str.length ; i ++ ){
			str[i] = sc.next();
		}
		
		System.out.println("" + str[0].charAt(0) + str[1].charAt(1) + str[2].charAt(2));
	}
}
