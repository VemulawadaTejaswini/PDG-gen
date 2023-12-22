import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int count = 0;
		for(int i=1; i<=N; i++) {
			int a=Integer.parseInt(sc.next());
			if(a%2 !=0 && i %2 !=0) count++;
		}
		System.out.println(count);
	}
}