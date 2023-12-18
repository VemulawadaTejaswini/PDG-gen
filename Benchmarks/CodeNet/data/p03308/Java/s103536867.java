import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long min = 5000000000l,max = 0,buf;
		for(int i = 0;i < N;i++) {
			buf = Math.abs(scn.nextLong());
			if(buf < min) {
				min = buf;
			}
			if(buf > max) {
				max = buf;
			}
		}
		scn.close();
		System.out.println(max - min);
	}
}
