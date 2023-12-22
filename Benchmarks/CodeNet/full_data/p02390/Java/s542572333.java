import java.util.Scanner;
public class Main{
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i>=0 && i<86400){
			int h = i / 3600;
			int m = i % 3600 /60;
			int s = i % 60;
			System.out.println(h+":"+m+":"+s);
		}
	}
	public static void main(String[] args){
		Main obj = new Main();
		obj.solve();
	}
}