import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long p = scn.nextLong(), q = scn.nextLong();
		scn.close();
		long buf_u = q,buf_d = p,buf = 0;
		while(buf_u%buf_d!=0) {
			buf = buf_d;
			buf_d = buf_u%buf_d;
			buf_u = buf;
		}
		buf = q/buf_d;
		buf_u = buf;
		for(int i = 2; i < Math.sqrt(buf)+1;i++) {
			while(buf%i==0) {
				buf /= i;
			}
			if(buf == 1) {
				buf_u = i;
				break;
			}
			buf = buf_u;
		}
		System.out.println(buf_u);
	}
}
