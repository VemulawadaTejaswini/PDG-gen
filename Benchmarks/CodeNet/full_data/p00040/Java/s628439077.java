import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		LOOP: for (int i = 0; i < n; i++){
			String s = sc.nextLine();
			for (int a = 3; true; a++){
				for (int b = 0; b < 26; b++) {
					if (a % 2 == 0 || a % 13 == 0) continue;
					StringBuffer BF = new StringBuffer(s);
					for (int j = 0; j < BF.length(); j++){
						if (Character.isLowerCase(BF.charAt(j)))
							BF.setCharAt(j, affineCipher(a, b, BF.charAt(j)));
					}
					if (BF.indexOf("that") != -1 || BF.indexOf("this") != -1) {
						System.out.println(BF.toString());
						continue LOOP;
					}
				}
			}
		}
	}
	private static char affineCipher(int a, int b, char y){
		int n = y - 'a';
		int f = (a * y + b) % 26;
		return (char) (f + 'a');
	}
}