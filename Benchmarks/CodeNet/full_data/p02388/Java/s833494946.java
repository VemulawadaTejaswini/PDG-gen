import java.util.Scanner;
public class Main{
	int x;
	public void solve(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x *=x *=x);
		
	
	}
	
	public static void main(String[] args){
		Main obj = new Main();
		obj.solve();	
	}
}