import java.util.Scanner;
public class Main {
	static int N;
	static String[] str;
	public static int dfs(int i,int j,int k) {
		if(str[i].equals(str[j])||str[j].equals(str[k])||str[k].equals(str[i])) {
			return 0;
		}
		else {
			return 1;
		}
	}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
	N=sc.nextInt();
	str=new String[N];
	String s=sc.next();
	for(int i=0;i<N;i++) {
		str[i]=String.valueOf(s.charAt(i));
	}
	int ans=0;
	for(int i=0;i<N-2;i++) {
		for(int j=i+1;j<N-1;j++) {
			for(int k=j+1;k<N;k++) {
				if(2*j!=(k+i)) {
				ans+=dfs(i,j,k);
				}
			}
		}
	}
	System.out.println(ans);
	}
}
