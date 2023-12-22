import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		int m;
		int h;

		while (true){
			s = sc.next();
			if (s.equals("-")){
				break;
			}

			m = sc.nextInt();

			for (int i = 0; i < m; i++){
				h = sc.nextInt();
				shuffle(s, h);
			}

			System.out.println(s);
		}
	}

	public static void shuffle(String s, int h){
		if (h >= s.length()){
			return;
		}
		s = s.substring(s.length() - h, s.length());
	}

}