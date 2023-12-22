import java.util.Scanner;
public class Main{
	Scanner cin = new Scanner(System.in);
	public void solve(){
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		
		for(int i = 0;i <= 60;i++){
			int t = 60 * i + c;
			if(t % (a + b) <= a){
				System.out.println(t);
				return;
			}
		}
		System.out.println(-1);
	}
	public static void main(String[] args){
		new Main().solve();
	}
}