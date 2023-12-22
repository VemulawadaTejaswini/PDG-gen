import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	static int sum;

	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}

	public static Boolean read(){
		if(!sc.hasNextInt())  return false;

		sum = sc.nextInt();
		sum += sc.nextInt();
		return true;
	}


	public static void solve(){
		System.out.println(Integer.toString(sum).length());
	}

}