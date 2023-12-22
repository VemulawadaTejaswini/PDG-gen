import java.util.Scanner;
class Main{

	public void solve(){
    Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		System.out.println(a*b+" "+(2*a+2*b));
	}
	public static void main(String[] args){
        Main obj =new Main();
        obj.solve();
    }
}