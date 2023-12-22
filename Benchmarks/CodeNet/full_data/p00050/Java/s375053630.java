import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		boolean f = false;
		
		for(String v :str){
			if(f){
				System.out.print(" ");
			}else{
				f = true;
			}
			
			if(v.indexOf("apple") >= 0){
				System.out.print("peach");
			}else if(v.indexOf("peach") >=0){
				System.out.print("apple");
			}else{
				System.out.print(v);
			}
		}
		
		System.out.print(".\n");
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}