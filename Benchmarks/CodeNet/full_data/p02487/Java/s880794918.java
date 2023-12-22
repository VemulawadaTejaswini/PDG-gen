import java.util.Scanner;


public class  Main {

	static Scanner sc = new Scanner(System.in);
	
	static int h, w;
	
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
		
		h = sc.nextInt();
		w = sc.nextInt();
		
		if(h == 0 && w == 0) return false;
		
		return true;
	}
	
	static void solve(){
		
		for(int i=0; i < w; i++){
			System.out.print("#");
		}
		System.out.println();
		
		for(int i=0; i < h - 2; i++){
			System.out.print("#");
			for(int j=0; j < w - 2; j++){
				System.out.print(".");
			}
			System.out.println("#");
		}
		
		for(int i=0; i < w; i++){
			System.out.print("#");
		}
		System.out.print("\n\n");
	}
}