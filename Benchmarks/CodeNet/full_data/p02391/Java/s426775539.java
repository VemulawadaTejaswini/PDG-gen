import java.util.Scanner;
public class Main{
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		
		
		int k =sc.nextInt();
		int l =sc.nextInt();
		int a,b;
		if(k < l){
			System.out.println("a < b");
		}else if(k > l){
			System.out.println("a > b");
		}else if(k == l){
			System.out.println("a == b");
		}
	}
	public static void main(String[] args){
		Main obj = new Main();
		obj.solve();
	}
}