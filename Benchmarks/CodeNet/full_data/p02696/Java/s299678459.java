import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = 0;
		int e;
		for(int i = 1; i <= c; i++) {
			e =(a*i)/b-a*(i/b);
			if(e>d) {
				d = e;
			}
		}
		System.out.println(d);
	}
}