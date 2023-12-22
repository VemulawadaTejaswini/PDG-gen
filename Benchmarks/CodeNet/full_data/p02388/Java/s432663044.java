import java.util.Scanner;
public class Itp1_1b{
	int x;

	public void solve(){
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.println(x*x*x);
		
	}
	
	public static void main(String[] args){
		Itp1_1b obj = new Itp1_1b();
		obj.solve();
	}
}