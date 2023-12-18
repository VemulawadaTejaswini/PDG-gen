import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(sum(sc));
	}

	static int sum(Scanner sc){
		int a = 700;
		String s = sc.next();

		for( int i = 0 ; i < 3 ; ++i){
			if(s.charAt(i) == 'o'){
				a = a + 100;
			}
		}

		return a;
	}
}