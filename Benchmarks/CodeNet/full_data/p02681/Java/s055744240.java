import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();




		if((S + T.charAt(T.length()-1)).equals(T)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}

