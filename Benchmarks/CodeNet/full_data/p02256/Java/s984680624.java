import java.util.Scanner;

public class Main {
	
	public static int solution(int x, int y) {
		if ((x%y)==0) {
			return y;
		}
		return solution(y, (x-((x/y)*y)));
	}
	
	public static void main(String[] Args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int out = solution(x,y);
		System.out.println(out);
	}
}

