import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int C = 0;

		int counter=0;
		int up=0;
		if(String.valueOf(str.charAt(0)).equals("A")) {
			for(int i=2; i<str.length()-2;i++) {

				if(String.valueOf(str.charAt(i)).equals("C")) {
					counter++;
					C=i;
				}
			}
			if(counter==1) {
				for(int i=1;i<str.length()-1;i++) {
					if(i!=C) {
						if(Character.isUpperCase(str.charAt(i))) {
							up++;
						}
					}
				}

				if(up==0) System.out.print("AC");
				else System.out.print("WA");
			}

			else System.out.print("WA");
		}

		else System.out.print("WA");
	}

}
