import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int NN = 2019;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
//		String s = sc.next();
		sc.close();
		long ans=0;
		long ren=0;
		if(s.length>=4) {
			int last=0;
			for (j = 0; j < s.length-3; j++) {
				int a = 0;
				for (i = j; i < j+3; i++) {
					a*=10;
					a+=(s[i]-'0');
				}
				for (i = j+3; i < s.length; i++) {
					a*=10;
					a+=(s[i]-'0');
					a=a%NN;
					if(a==0) {
//						out.printf("%d:%d%n",j,i);
						ans++;
						if(last+1==j) {
							ren++;
						} else {
							ans+=(ren+1)*ren/2;
							ren=0;
						}
						last=i;
						j=i-2;
						break;
					}
				}
			}
			ans+=(ren+1)*ren/2;
		}
		out.println(ans);
	}
}
