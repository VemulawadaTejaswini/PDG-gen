import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int count = 0;
		for(int i=0;i < N;i++) {
			long x = Long.parseLong(sc.next());
			long y = Long.parseLong(sc.next());
			if(Math.sqrt(x*x+y*y) <= D) {
				count++;
			}
		}
		System.out.println(count);
	}
}

