import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static String merge(String s1, String s2) {
		for(int i=0; i<s1.length(); i++) {
			boolean f=true;
			for(int j=0; i+j<s1.length(); j++) {
				if(j>s2.length()-1) break;
				if(s1.charAt(i+j)!=s2.charAt(j)) {
					f=false;
					break;
				}
			}
			if(f) {
				if(i+s2.length()<=s1.length()) return "";
				return s2.substring(s1.length()-i);
			}
		}
		return s2;
	}
	
	static boolean match(String s1, String s2) {
		if(s1.length()<s2.length()) {
			return false;
		}
		for(int i=0; i+s2.length()<s1.length(); i++) {
			if(s1.substring(i, i+s2.length()).equals(s2)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				String[] moji=new String[n];
				for(int i=0; i<n; i++) {
					moji[i]=sc.next();
				}
				boolean[] moji1=new boolean[n];
				String[] s=new String[n];
				int count=0;
				for(int i=0; i<n; i++) {
					if(moji1[i]) continue;
					for(int j=0; j<n; j++) {
						if(i==j) continue;
						if(match(moji[i], moji[j])) {
							moji1[j]=true;
						}
					}
				}
				ArrayList<String> list=new ArrayList<>();
				for(int i=0; i<n; i++) {
					if(! moji1[i]) {
						list.add(moji[i]);
					}
				}
				n=list.size();
				String[][] mer=new String[n+1][n+1];
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						mer[i][j]=merge(list.get(i), list.get(j));
					}
				}
				
				for(int i=0; i<n; i++) {
					mer[n][i]=list.get(i);
				}
				String INF="SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS";
				String res=INF;
				String[][] dp=new String[(1<<n)][n+1];
				for(int i=0; i<(1<<n); i++) {
					for(int j=0; j<=n; j++) {
						dp[i][j]=INF;
					}
				}
				dp[0][n]="";
				for(int i=0; i<(1<<n); i++) {
					for(int j=0; j<=n; j++) {
						if(dp[i][j]==INF) continue;
						if(i==(1<<n)-1) {
							if(res.length()>dp[i][j].length()) {
								res=dp[i][j];
							}
							else if(res.length()==dp[i][j].length()) {
								res=res.compareTo(dp[i][j])>0 ? dp[i][j]:res;
							}
						}
						for(int k=0; k<n; k++) {
							if((i&(1<<k))==1) continue;
							int next = i|(1<<k);
							String nexts=dp[i][j]+mer[j][k];
							if(dp[next][k].length()>nexts.length()) {
								dp[next][k]=nexts;
							}
							else if(dp[next][k].length()==nexts.length()) {
								dp[next][k]=dp[next][k].compareTo(nexts)>0 ? nexts:dp[next][k];
							}
						}
					}
				}
				System.out.println(res);
				
			}
			
		}
	}
}
