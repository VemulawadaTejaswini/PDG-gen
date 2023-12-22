import java.util.Scanner;
public class Main{
	int n,p;
	
	public void solve(){
		Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	p=n*n*n;
	System.out.println(p);
	}
	
	public static void Main(String[]args){
	Main obj=new Main();
	obj.solve();
	}
}