import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.next();
		for(int i = 0; i < str.length(); i++){
			System.out.print((char)(str.charAt(i) + 3) % 'A');
		}
	}
}