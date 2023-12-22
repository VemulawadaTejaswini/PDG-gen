import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static Scanner sc = new Scanner(System.in);
	public static int n;
	public static int[] score = new int[2];
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		while(read()){
			solve();
		}
	}

	
	public static boolean read(){
		n = sc.nextInt();
		score[0] = 0;
		score[1] = 0;
		
		if(n == 0){
			return false;
		}
		
		for(int i=0; i<n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > b){
				score[0] += a;
				score[0] += b;
			} else if(a < b){
				score[1] += a;
				score[1] += b;
			} else{
				score[0] += a;
				score[1] += b;
			}
		}
		
		return true;
	}
	
	public static void solve(){
		System.out.println(Integer.toString(score[0]) + " " + Integer.toString(score[1]));
		
	}
	
	
	
}