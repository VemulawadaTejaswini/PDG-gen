import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long b = sc.nextLong();
		long c = sc.nextLong();
		int e;
		int d=0;
		for(int i = 1; i <= c; i++) {
			e =(int)((a*i)/b-a*(i/b));
			if(e>d) {
				d = e;
			}
		}
		System.out.println(d);
	}
}
