import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), Y = sc.nextInt() / 1000;
		boolean find = false;
		for(int x = 0; x <= N && x * 10 <= Y; x++) {
			for(int y = 0; x + y <= N && x * 10 + y * 5 <= Y; y++) {
				if(Y - 10 * x - 5 * y == N - x - y) {
					find = true;
					System.out.println(x + " " + y + " " + (N - x - y));
					break;
				}
			}
			if(find) break;
		}
		if(!find) System.out.println("-1 -1 -1");
	}
}