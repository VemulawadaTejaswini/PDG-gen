import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int A, B, O, AB;
	public static void main(String[] args) {
		while(read()){

		}
		solve();
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		
		String[] s = sc.next().split(",");
		
		if(s[1].equals("A")){
			A++;
		}else if(s[1].equals("B")){
			B++;
		}else if(s[1].equals("AB")){
			O++;
		}else if(s[1].equals("O")){
			AB++;
		}
		return true;
	}
	
	static void solve(){
		System.out.println(A);
		System.out.println(B);
		System.out.println(O);
		System.out.println(AB);
	}

}