import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	String str=scan.next();
	int ans=0;
	for(int i=1;i<str.length();i++) {
		int count=0;
		String A=str.substring(0,i);
		String B=str.substring(i,str.length());
		for(char c='a';c<='z';c++) {
			String S=String.valueOf(c);
			if(A.indexOf(S)!=-1&&B.indexOf(S)!=-1) {
				count++;
			}
		}
		if(ans<count) {
			ans=count;
		}
	}
	System.out.println(ans);
	scan.close();
}
}