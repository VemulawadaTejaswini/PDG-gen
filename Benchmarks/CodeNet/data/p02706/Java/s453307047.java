import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = 0; i < b; i++) {
			a -= sc.nextInt();
		}
		if(a<0) System.out.println(-1);
		else System.out.println(a);
	}
}
