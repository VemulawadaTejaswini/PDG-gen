import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		String str = sc1.next();
		String[] array = new String[26];
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();

		array[0] = "a";
		array[1] = "b";
		array[2] = "c";
		array[3] = "d";
		array[4] = "e";
		array[5] = "f";
		array[6] = "g";
		array[7] = "h";
		array[8] = "i";
		array[9] = "j";
		array[10] = "k";
		array[11] = "l";
		array[12] = "m";
		array[13] = "n";
		array[14] = "o";
		array[15] = "p";
		array[16] = "q";
		array[17] = "r";
		array[18] = "s";
		array[19] = "t";
		array[20] = "u";
		array[21] = "v";
		array[22] = "w";
		array[23] = "x";
		array[24] = "y";
		array[25] = "z";

		map.put('a', 0);
		map.put('b', 1);
		map.put('c', 2);
		map.put('d', 3);
		map.put('e', 4);
		map.put('f', 5);
		map.put('g', 6);
		map.put('h', 7);
		map.put('i', 8);
		map.put('j', 9);
		map.put('k', 10);
		map.put('l', 11);
		map.put('m', 12);
		map.put('n', 13);
		map.put('o', 14);
		map.put('p', 15);
		map.put('q', 16);
		map.put('r', 17);
		map.put('s', 18);
		map.put('t', 19);
		map.put('u', 20);
		map.put('v', 21);
		map.put('w', 22);
		map.put('x', 23);
		map.put('y', 24);
		map.put('z', 25);

		String a = "null";
		String ans = "";
		if("zyxwvutsrqponmlkjihgfedcba".equals(str)) {
			System.out.println("-1");
		}
		else {
			for (int i = 0 ; i < 26 ; i++ ) {
				if(str.indexOf(array[i])==-1) {
					a = array[i];
					ans = str + a;
					break;
				}
			}

			if (a.equals("null")) {
				for (int i = 25 ; i > 0 ; i-- ) {
					if(map.get(str.charAt(i)) > map.get(str.charAt(i-1))){

						char c = str.charAt(i-1);
						char d = 'z';
						for (int j = 25 ; j > i-1 ; j-- ) {
							if(map.get(str.charAt(j)) > map.get(c)) {
								if(map.get(str.charAt(j)) < map.get(d)) {
									d = str.charAt(j);
								}
							}
						}
						ans = str.substring(0, i-1) + d;
						break;
					}
				}
			}
			System.out.println(ans);
		}
		sc1.close();
	}
}