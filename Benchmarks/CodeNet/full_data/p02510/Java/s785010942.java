import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int count, h;

		while(true){
			str = sc.next();
			if(str.equals("-")) break;
			count = sc.nextInt();
			for(int i=0; i<count; i++){
				str = shaffle(str, sc);
			}
			System.out.println(str);
		}
	}

	static String shaffle(String str, Scanner sc){
		String before, after;
		int h = sc.nextInt();

		before = str.substring(0, h);
		after = str.substring(h, str.length());

		return after + before;
	}
}