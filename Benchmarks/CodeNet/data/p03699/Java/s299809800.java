import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int sum=0;
		int[] s = new int[n+1];
		for(i=1;i<=n;i++) {
			s[i] = parseInt(sc.next());
			sum+=s[i];
		}
		sc.close();
		Arrays.parallelSort(s);
		int tmp=0;
		int ans=0;
		for(i=0;i<=n;i++) {
			tmp = sum-s[i];
			if(tmp%10!=0) {
				ans=tmp;
				break;
			}
		}
		out.println(ans);
	}
}
