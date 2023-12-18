import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
//		String s = sc.next();
		char[] s = sc.next().toCharArray();
		sc.close();
		int[] rsum = new int[n+1];
		int[] gsum = new int[n+1];
		int[] bsum = new int[n+1];
		for (i = n-1; i >= 0; i--) {
			rsum[i]=rsum[i+1];
			gsum[i]=gsum[i+1];
			bsum[i]=bsum[i+1];
			switch(s[i]) {
			case 'R':
				rsum[i]++;
				break;
			case 'G':
				gsum[i]++;
				break;
			case 'B':
				bsum[i]++;
				break;
			}
		}
//		out.println(Arrays.toString(rsum));
//		out.println(Arrays.toString(gsum));
//		out.println(Arrays.toString(bsum));
		long sum=0;
		for (i = 0; i < n-2; i++) {
			for (j = i+1; j < n-1; j++) {
				if(s[i]==s[j])continue;
				int di = j-i;
				for (k = j+1; k < n; k++) {
					if(s[j]!=s[k]&&s[k]!=s[i]&&di!=k-j) {
						int tmp=0;
						if(di>k-j&&j+di<n&&s[k]==s[j+di])sum--;
						switch(s[k]) {
						case 'R':
							tmp=rsum[k];
//							sum++;
							break;
						case 'G':
							tmp=gsum[k];
//							sum++;
							break;
						case 'B':
							tmp=bsum[k];
//							sum++;
							break;
						}
						sum+=tmp;
//						out.printf("%d,%d,%d,%d%n",i,j,k,tmp);
						break;
					}
				}
			}
		}
		out.println(sum);
	}
}
