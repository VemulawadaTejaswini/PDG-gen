import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer buf = new StringBuffer();
		int[] p = {2,31, 37, 41 ,43 ,47, 53, 59,
				61, 67 ,71, 73, 79, 83, 89, 97,
				101 ,103 ,107, 109 ,113 ,127, 131,
				137, 139 ,149 ,151 ,157 ,163 ,167,
			181 ,191 ,193, 197, 199 ,
				211 ,223 ,227, 229 ,233, 239 ,241,
				251, 257 ,263 ,269 ,271, 277, 281 ,
				283 ,293 ,307, 311, 313 ,317 ,331 ,
				337, 347, 349, 353 ,359 ,367 ,373,};
		int N =sc.nextInt();
		String ans="";
		if(N%2==0) {
			for(int i = 0;i<N-1;i++) {
				buf.append(p[i]);
				buf.append(" ");
			}
		}else {
			for(int i = 1;i<N;i++) {
				buf.append(p[i]);
				buf.append(" ");
			}
		}
		ans = buf.toString();
		System.out.println(ans);
		sc.close();
	}
}
