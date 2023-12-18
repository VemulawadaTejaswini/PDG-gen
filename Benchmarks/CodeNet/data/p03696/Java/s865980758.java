import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int N;
	String S;
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		S=sc.next();
		StringBuffer sx=new StringBuffer();
		for(int i=0;i<S.length();i++){
			if(S.charAt(i)=='(')sx.append('a');
			else sx.append('b');
		}
		
		
		for(int i=0;i<sx.length();i++){
			if(sx.charAt(i)=='a'){
				for(int j=sx.length()-1;j>i;j--){
					if(sx.charAt(j)=='b'){
						sx.delete(i, i+1);
						sx.delete(j-1,j);
						break;
					}
				}
			}
		}
		
		for(int i=sx.length()-1;i>=0;i--){
			if(sx.charAt(i)=='b'){
				for(int j=0;j<i;j++){
					if(sx.charAt(j)=='a'){
						sx.delete(i, i+1);
						sx.delete(j-1,j);
						break;
					}
				}
			}
		}
		
		int cnt_a=0;
		int cnt_b=0;
		for(int i=0;i<sx.length();i++){
			if(sx.charAt(i)=='a')cnt_a++;
			else cnt_b++;
		}
		
		StringBuffer ans=new StringBuffer();
		for(int i=0;i<cnt_b;i++){
			ans.append('(');
		}
		ans.append(S);
		for(int i=0;i<cnt_a;i++){
			ans.append(')');
		}
		
		System.out.println(ans);
	}
}
