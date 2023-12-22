import java.util.Scanner;

class Main{
	public void solve(){
	     Scanner sc=new Scanner(System.in);
         int a,b,menseki,takasa;
		 a=sc.nextInt();
		 b=sc.nextInt();
		 menseki=a*b;
		 takasa=2*a+2*b;
		 System.out.println(menseki+"???"+takasa);
	}
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}