import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		int c=0;
		for(int i=1;i<s.length();i++){
		int	j=i-1;
			if(ch[j]==ch[i]){
				if(ch[j]=='1'){
			      ch[i]='0';
				c++;
				}
				else{
				ch[i]='1';
					c++;
				}
			}
		}
		System.out.println(c);
	}
}