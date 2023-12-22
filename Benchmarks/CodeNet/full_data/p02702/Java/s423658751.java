import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] s=sc.nextLine().toCharArray();
		long[] m=new long[s.length+1];
		long[] l= new long[s.length+1];
		l[0]=1;
		for(int i=0;i<s.length;i++){
			m[i+1]=(m[i]*10+((int)s[i]-(int)'0'))%2019;
			l[i+1]=(l[i]*10)%2019;
		}
		long ans=0;
		for(int j=1;j<s.length+1;j++){
			for(int i=0;i<j;i++){
				if((m[j]-m[i]*l[j-i])%2019==0){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}