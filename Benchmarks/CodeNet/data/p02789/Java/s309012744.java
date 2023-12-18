import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		if(N == M) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}
}