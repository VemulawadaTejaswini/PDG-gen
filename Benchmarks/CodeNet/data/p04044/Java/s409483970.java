
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int L=sc.nextInt();
		String[] s=new String[N];
		
		for(int i=0;i<N;i++){
			s[i]=sc.next();
		}
		for(int i=N-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(isLarge(s[j],s[j+1],L)==1){
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		
		String ans="";
		for(int i=0;i<N;i++)ans+=s[i];
		System.out.println(ans);
	}
	
	int isLarge(String s1,String s2,int L){
		for(int i=0;i<L;i++){
			if(s1.charAt(i)>s2.charAt(i))return 1;
			else if(s1.charAt(i)<s2.charAt(i))return -1;
		}
		return 0;
	}
}
