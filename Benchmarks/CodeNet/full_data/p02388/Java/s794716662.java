import java.util.Scanner;
public class Main{
	int X,a,b;
	
	public void solve(){
		Scanner sc=new Scanner(System.in);
		X=sc.nextInt();
		
		a=X*X;
		b=a*X;
		
		System.out.println(b);
	}
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}