import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char[] s=sc.next().toCharArray();
		if(s[0]=='0' || s[s.length-1]=='1'){
			System.out.println(-1);
			return;
		}
		for(int i=0; i<s.length/2; i++){
			if(s[i]!=s[s.length-2-i]){
				System.out.println(-1);
				return;
			}
		}
		PrintWriter ans=new PrintWriter(System.out);
		ans.println(1+" "+2);
		int point=2;
		for(int i=1; i<s.length-1; i++){
			ans.println(point+" "+(i+2));
			if(s[i]=='1'){
				point=i+2;
			}
		}
		ans.flush();
	}
}
