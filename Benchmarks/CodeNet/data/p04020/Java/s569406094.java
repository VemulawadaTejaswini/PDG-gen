import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		for(i=0;i<n;i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		int cnt=0;
		for(i=0;i<n;i++) {
			cnt += a[i]/2;
			a[i] %= 2;
		}
		for(i=0;i<n-1;i++) {
			if(a[i]==1 && a[i+1]==1) {
				cnt++;
				a[i]=0;
				a[i+1]=0;
			}
		}
		out.println(cnt);
	}
}
