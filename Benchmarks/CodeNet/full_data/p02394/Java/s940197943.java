import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\s");
		
		String W = scan.next();
		String H = scan.next();
		String x = scan.next();
		String y = scan.next();
		String r = scan.next();
		
		
		
		System.out.println(JudgeCircle(Integer.parseInt(W), Integer.parseInt(H), Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(r)));
	}
	
	public static String JudgeCircle(int W, int H, int x, int y, int r){
		if(x + r <= W && x - r >= 0 && y + r <= H && y - r >= 0){
			return "Yes";
		}else{
			return "No";
		}
	}
}