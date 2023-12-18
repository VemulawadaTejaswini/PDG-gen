import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		if (c[0]==97||c[0]==101||c[0]==105||c[0]==111||c[0]==117){
			System.out.println("vowel");
		}
		else{
			System.out.println("consonant");
		}
	}

}
