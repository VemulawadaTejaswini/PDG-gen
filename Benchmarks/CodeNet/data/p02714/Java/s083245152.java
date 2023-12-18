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
		char[] s = sc.next().toCharArray();
		sc.close();
		HashMap<Character, Integer> m = new HashMap<>();
		m.put('R', 0);
		m.put('G', 1);
		m.put('B', 2);
		int[][] revsum = new int[3][n+1];
//		int[] rsum = new int[n+1];
//		int[] gsum = new int[n+1];
//		int[] bsum = new int[n+1];
		for (i = n-1; i >= 0; i--) {
			revsum[0][i]=revsum[0][i+1];
			revsum[1][i]=revsum[1][i+1];
			revsum[2][i]=revsum[2][i+1];
			revsum[m.get(s[i])][i]++;
//			rsum[i]=rsum[i+1];
//			gsum[i]=gsum[i+1];
//			bsum[i]=bsum[i+1];
//			switch(s[i]) {
//			case 'R':
//				rsum[i]++;
//				break;
//			case 'G':
//				gsum[i]++;
//				break;
//			case 'B':
//				bsum[i]++;
//				break;
//			}
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
//						int tmp=0;
						sum+=revsum[m.get(s[k])][k];
						int j_di=j+di;
						if(j_di>k&&j_di<n&&s[k]==s[j_di])sum--;
//						switch(s[k]) {
//						case 'R':
//							sum+=rsum[k];
////							sum++;
//							break;
//						case 'G':
//							sum+=gsum[k];
////							sum++;
//							break;
//						case 'B':
//							sum+=bsum[k];
////							sum++;
//							break;
//						}
//						sum+=tmp;
//						out.printf("%d,%d,%d,%d%n",i,j,k,tmp);
						break;
					}
				}
			}
		}
		out.println(sum);
	}
}
