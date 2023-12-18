import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		char[]ans=new char[n];
		for(int i=0;i<n;i++) {
			ans[i]=s.charAt(i);
		}
		int k=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int time='z'-s.charAt(i)+1;
			if(time!=26 && time<=k) {
				ans[i]='a';
				k-=time;
			}
		}
		k%=26;
		if(ans[n-1]+k>122) {
			k-=122-ans[n-1]+1;
			ans[n-1]=(char)('a'+k);
		}else {
			ans[n-1]=(char)(ans[n-1]+k);
		}
		for(int i=0;i<n;i++) {
			System.out.print(ans[i]);
		}
		System.out.println();
	}
	
}