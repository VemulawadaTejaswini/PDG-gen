import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count = 0;
		if (a==b&&b==c&&a==c){
			count = 1;
		}
		else if (a==b&&b!=c&&a!=c||a==c&&a!=b&&c!=b){
			count = 2;
		}
		else if(a!=b&&b!=c&&a!=c){
			count = 3;
		}
		System.out.println(count);
	}

}
