import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kbScanner = new Scanner(System.in);
		
		int w = kbScanner.nextInt();
		int h = kbScanner.nextInt();
		int x = kbScanner.nextInt();
		int y = kbScanner.nextInt();
		int r = kbScanner.nextInt();
		
		String str;
		
		if(judge(w, h, x, y, r)){
			str = "Yes";
		}else{
			str = "No";
		}
		
		System.out.println(str);
	}
	
	private static boolean judge(int w, int h, int x, int y, int r){
		if(x - r < 0 || y - r < 0){
			return false;
		}
		if(y + r > h || x + r > w){
			return false;
		}
		
		return true;
	}
}