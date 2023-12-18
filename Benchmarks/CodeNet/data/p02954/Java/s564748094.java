import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str=sc.next().toCharArray();
		sc.close();
		int first=0,l=0;
		char oc=str[0],nc;
		String ans="";
		String temp="";
		for(int i=1;i<str.length;i++) {
			nc=str[i];
			if(oc=='R'&&nc=='L') {
				l=i;
			}else if(oc=='L'&&nc=='R'){
				int rNum=l-first,lNum=i-l;
				int rVal=lNum/2,lVal=rNum/2;
				rNum-=lVal;
				lVal+=lNum-rVal;
				rVal+=rNum;
				ans+=" "+rVal+" "+lVal+temp;
				temp="";
				first=i;
			}else if(oc=='R'&&nc=='R') {
				ans+=" 0";
			}else {//LL
				temp+=" 0";
			}
			oc=nc;
		}
		int rNum=l-first,lNum=str.length-l;
		int rVal=lNum/2,lVal=rNum/2;
		rNum-=lVal;
		lVal+=lNum-rVal;
		rVal+=rNum;
		ans+=" "+rVal+" "+lVal+temp;
		System.out.println(ans.substring(1));
	}

}