import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n;
		while((n = scn.nextInt())!=0) {
			long min = 0,max = -100000000000l,buf = 0;
			for(int i = 0;i < n;i++) {
				 buf += scn.nextLong();
				 max = Math.max(max, buf);
				 min = Math.min(min, buf);
			}
			System.out.println(max - min);
		}
		scn.close();
	}
}
