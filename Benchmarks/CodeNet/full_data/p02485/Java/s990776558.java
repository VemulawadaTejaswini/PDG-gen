import java.util.Scanner;


public class  Main {

	static Scanner sc = new Scanner(System.in);
	
	static String str;
	
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
		
		str = sc.next();
		
		if(str.equals("0")) return false;
		
		return true;
	}
	
	static void solve(){
		
		int sum=0;
		char number[] = str.toCharArray();
		int num[] = new int[number.length];
		
		for(int i=0; i < number.length; i++){
			num[i] = number[i] - '0';
		}
		
		for(int i=0; i < num.length; i++){
			sum += num[i];
		}
		
		System.out.println(sum);
	}

}