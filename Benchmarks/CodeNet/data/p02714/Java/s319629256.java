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
		long sum=0;
		for (i = 0; i < n-2; i++) {
			for (j = i+1; j < n-1; j++) {
				for (k = j+1; k < n; k++) {
					if(s[i]!=s[j]&&s[j]!=s[k]&&s[k]!=s[i]&&j-i!=k-j) {
						switch(s[k]) {
						case 'R':
							sum++;
							break;
						case 'G':
							sum++;
							break;
						case 'B':
							sum++;
							break;
						}
					}
				}
			}
		}
		out.println(sum);
	}
}
