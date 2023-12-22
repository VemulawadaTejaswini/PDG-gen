import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		run();
	}
	
	static void run(){
		int n, m;
		n = scan.nextInt();
		m = scan.nextInt();
		
		int[] array = new int[n + 1];
		boolean[] judge = new boolean[n + 1];
		
		for(int i = 1; i <= m; i++){
			array[i] = scan.nextInt();
		}
		
		for(int i = m; i > 0; i--){
			if(check(array[i], judge, m)){
				System.out.println(array[i]);
			}
		}
		
		for(int i = 1; i <= n; i++){
			if(!judge[i]){
				System.out.println(i);
			}
		}
	}
	
	static boolean check(int c, boolean[] judge, int m){
		if(judge[c]){
			return false;
		}
		judge[c] = true;
		return true;
	}
}