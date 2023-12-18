import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}

	void solve(){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		int MinCount=100;
		for(int i=0;i<s.length();i++) {
			char target=s.charAt(i);
			
			String t2=s;
			int count=0;
			while(true) {
				String t1="";
				for(int j=0;j<t2.length()-1;j++) {
					if(t2.charAt(j)==target) {
						t1+=t2.charAt(j);
					}else if(t2.charAt(j+1)==target){
						t1+=t2.charAt(j+1);
					}else {
						t1+=t2.charAt(j);
					}
				}
				boolean flag=true;
				for(int j=0;j<t2.length()-1;j++) {
					if(t2.charAt(j)!=t2.charAt(j+1))flag=false;
				}
				if(flag)break;
				count++;
				t2=t1;
			}
			MinCount=Math.min(count, MinCount);
		}
		System.out.println(MinCount);
	}
}
