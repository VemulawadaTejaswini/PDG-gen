import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] s = new char[3][];
		for(int i=0; i<3; i++)
			s[i] = sc.next().toCharArray();
		int O = 2000;
		boolean[][] match = new boolean[3][O*4+1];
		for(int i=0; i<3; i++) {
			Arrays.fill(match[i], true);
			
			int j=(i+1)%3;
			for(int k=-s[j].length; k<=s[i].length; k++) {
				boolean ok = true;
				for(int l=Math.max(k, 0); l<Math.min(s[i].length, k+s[j].length); l++) {
					if(s[i][l]!='?' && s[j][l-k]!='?' && s[i][l]!=s[j][l-k]) {
						ok = false;
						break;
					}
				}
				match[i][O*2+k] = ok;
			}
		}
		
		int ans = s[0].length + s[1].length + s[2].length;
		
		for(int i=0; i<3; i++) {
			int j=(i+1)%3;
			int k=(i+2)%3;
			for(int l=0; l<=s[i].length; l++) {
				if(!match[i][O*2+l])
					continue;
				for(int m=l; m<=Math.max(s[i].length, l+s[j].length); m++) {
					if(match[j][O*2+m-l] && match[k][O*2-m]) {
						ans = Math.min(ans, Math.max(s[i].length, Math.max(l+s[j].length, m+s[k].length)));
					}
				}
			}
			for(int l=0; l<=s[i].length; l++) {
				if(!match[k][O*2-l])
					continue;
				for(int m=l; m<=Math.max(s[i].length, l+s[k].length); m++) {
					if(match[j][O*2-m+l] && match[i][O*2+m]) {
						ans = Math.min(ans, Math.max(s[i].length, Math.max(l+s[k].length, m+s[j].length)));
					}
				}
			}
		}
		
		System.out.println(ans);
		sc.close();
	}

}

