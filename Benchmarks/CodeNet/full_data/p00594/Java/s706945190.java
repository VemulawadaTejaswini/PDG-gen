import java.util.HashMap;
import java.util.Scanner;

class Main{

	static Scanner scanner = new Scanner(System.in);
	static HashMap<Integer, Integer> map;

	public static void main(String args[]){

		String str = new String();
		while(true){
			int n = scanner.nextInt();
			map = new HashMap<Integer, Integer>();
			if(n == 0) break;
			solve(n);
		}
	}

	static void solve(int n){
		for(int i = 0; i < n; i++){
			int m = Integer.parseInt(scanner.next());
		}
	}
}