import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		run();
	}
	static void run(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = isDivisor(a, b, c);
		System.out.println(ans);
	}
	static int isDivisor(int a, int b, int c){
		int ans = 0;
		for(int i = a; i <= b; i++){
			if(c % i == 0){
				ans++;
			}
		}
		return ans;
	}
}