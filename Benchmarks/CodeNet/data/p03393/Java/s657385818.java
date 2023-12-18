import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		String str = sc1.next();
		String[] array = new String[26];

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
				for (int i = 0 ; i < 26 ; i++ ) {
					if(str.indexOf(array[i])>str.indexOf(array[i+1])){
						ans = str.substring(0, i-1) + array[i];
						break;
					}
				}
			}

			System.out.println(ans);

		}

		sc1.close();

	}

}