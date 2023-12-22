import java.util.Scanner;
public class ITP1_1b{
	int x;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		x = sc.nextInt();
		System.out.println(x*x*x);
	}
	
	public static void main(String[] args){
		ITP1_1b obj = new ITP1_1b();
		obj.solve();
	}
}