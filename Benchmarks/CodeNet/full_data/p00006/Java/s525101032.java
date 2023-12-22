import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	static String str;

	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}

	public static Boolean read(){
		if(!sc.hasNext())  return false;

		str = sc.next();
		return true;
	}


	public static void solve(){
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

}