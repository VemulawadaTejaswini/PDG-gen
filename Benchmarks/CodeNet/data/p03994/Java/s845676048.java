import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		char[]ans=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			ans[i]=s.charAt(i);
		}
		int k=sc.nextInt();
		
		for(int i=0;i<s.length();i++) {
			int time='z'-s.charAt(i)+1;
			if(time<=k) {
				ans[i]='a';
				k-=time;
			}
		}
		ans[n-1]=(char)(ans[n-1]+k);
		for(int i=0;i<s.length();i++) {
			System.out.print(ans[i]);
		}
		System.out.println();
	}
	
}
