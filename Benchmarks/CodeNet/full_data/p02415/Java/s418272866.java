import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str = sc.nextLine();
			char []csen = str.toCharArray();
			for(int i = 0;i < str.length();i++) {
				if( Character.isUpperCase( csen[i] ) ) {
					csen[i] = Character.toLowerCase(csen[i]);
					System.out.print(csen[i] );
				}
				else if( Character.isLowerCase( csen[i] ) ) {
					csen[i] = Character.toUpperCase(csen[i]);
					System.out.print(csen[i] );
				}
				else {
					System.out.print(csen[i]);
				}
			}
			System.out.println();
		}
	}
}

