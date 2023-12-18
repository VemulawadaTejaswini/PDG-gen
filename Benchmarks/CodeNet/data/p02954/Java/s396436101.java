import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str=sc.next().toCharArray();
		sc.close();
		int first=0,l=0;
		char oc=str[0],nc;
		String ans="";
		for(int i=1;i<str.length;i++) {
			nc=str[i];
			if(oc=='R'&&nc=='L') {
				l=i;
			}else if(oc=='L'&&nc=='R'){
				int rNum=l-first,lNum=i-l;
				for(int j=1;j<rNum;j++) {
					ans+=" 0";
				}
				int rVal=lNum/2,lVal=rNum/2;
				rNum-=lVal;
				lVal+=lNum-rVal;
				rVal+=rNum;
				ans+=" "+rVal+" "+lVal;
				for(int j=1;j<lNum;j++) {
					ans+=" 0";
				}
				first=i;
			}
			oc=nc;
		}
		int rNum=l-first,lNum=str.length-l;
		for(int j=1;j<rNum;j++) {
			ans+=" 0";
		}
		int rVal=lNum/2,lVal=rNum/2;
		rNum-=lVal;
		lVal+=lNum-rVal;
		rVal+=rNum;
		ans+=" "+rVal+" "+lVal;
		for(int j=1;j<lNum;j++) {
			ans+=" 0";
		}
		System.out.println(ans.substring(1));
	}

}
