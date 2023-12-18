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
		
		StringBuffer sx=new StringBuffer(S);
		
		for(int i=0;i<sx.length();i++){
			if(sx.charAt(i)=='('){
				for(int j=sx.length()-1;j>i;j--){
					if(sx.charAt(j)==')'){
						sx.delete(i, i+1);
						sx.delete(j-1,j);
						break;
					}
				}
			}
		}
		
		for(int i=sx.length()-1;i>=0;i--){
			if(sx.charAt(i)==')'){
				for(int j=0;j<i;j++){
					if(sx.charAt(j)=='('){
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
			if(sx.charAt(i)=='(')cnt_a++;
			else cnt_b++;
		}
		
		String ans="";
		for(int i=0;i<cnt_b;i++){
			ans+='(';
		}
		ans+=S;
		for(int i=0;i<cnt_a;i++){
			ans+=')';
		}
		
		System.out.println(ans);
	}
}
