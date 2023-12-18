import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] ary = new int[2];
		ary[0] = Integer.parseInt(s.substring(0, 2));
		ary[1] = Integer.parseInt(s.substring(2));
		String ans;
		if(isMM(ary[0])){
			if(isMM(ary[1])) {
				ans = "AMBIGUOUS";
			}else{
				ans = "MMYY";
			}
		}else{
			ans = (isMM(ary[1])) ? "YYMM" : "NA";
		}
		System.out.println(ans);
	}
	static boolean isMM(int n){
		return n > 0 && n < 13;
	}
}
