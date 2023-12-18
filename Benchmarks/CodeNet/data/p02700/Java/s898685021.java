import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tv = sc.nextInt();
		int ta = sc.nextInt();
		int av = sc.nextInt();
		int aa = sc.nextInt();
		while(true) {
			av -= ta;
			if(av <= 0) {
				 System.out.println("Yes");
				 break;
			}
			tv -= aa;
			if(tv <= 0) {
				System.out.println("No");
				break;
			}
		}
	}
}