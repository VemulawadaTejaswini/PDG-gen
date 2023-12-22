import java.util.Scanner;


public class  Main {

	static Scanner sc = new Scanner(System.in);
	
	static int m, f, r;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		while(read()){
			solve();
		}
	}
	
	static boolean read(){

		m = sc.nextInt();
		f = sc.nextInt();
		r = sc.nextInt();
		
		if(m == -1 && f == -1 && r == -1) return false;
		
		return true;
	}
	
	static void solve(){
		
		int sum = m + f;
		String rank = "";
		
		if(m == -1 || f == -1){
			rank = "F";
		}
		else if(sum >= 80){
			rank = "A";
		}
		else if(sum < 80 && sum >=65){
			rank = "B";
		}
		else if(sum < 65 && sum >=50){
			rank = "C";
		}
		else if(sum < 50 && sum >=30){
			rank = "D";
			if(r >= 50){
				rank = "C";
			}
		}
		else if(sum < 30){
			rank = "F";
		}
		
		System.out.println(rank);
		
	}

}