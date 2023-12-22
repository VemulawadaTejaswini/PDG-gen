import java.util.Scanner;
public class Main{
	int x;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		x = x*x*x;
		
		System.out.println(x);
	}
	
	
	public static void main(String[] args){
		Main obj = new Main();
		obj.solve();
	}
}