import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		HashMap<Character, String> hmap=new HashMap<>();
		hmap.put('S', "Cloudy");
		hmap.put('C', "Rainy");
		hmap.put('R', "Sunny");
		
		String str=scn.next();
		if(str.charAt(0)=='S') {
			System.out.println(hmap.get('S'));
		}else if(str.charAt(0)=='C') {
			System.out.println(hmap.get('C'));

		}else if(str.charAt(0)=='R'){
			System.out.println(hmap.get('R'));

		}
	}

}