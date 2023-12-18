import java.util.*;


public class Solution {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int sh = s.nextInt();
		int w = s.nextInt();
		if(w >= sh) {
			System.out.println("unsafe");
		}else {
			System.out.println("safe");
		}
	}
}