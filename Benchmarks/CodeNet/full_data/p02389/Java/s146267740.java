import java.util.Scanner;
public class Main{
	int m,s;
	public void solve(){
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		m=a*b;
		s=a*2+b*2;
		
		System.out.print(m+" "+s);
	}
	
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}