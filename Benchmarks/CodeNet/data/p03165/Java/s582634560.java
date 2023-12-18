import java.util.Scanner;


public class Main{
	public static String LCS(int x,int y,char[]s1,char[]s2){
		if(x==0||y==0)
			return "";
		else
			if(s1[x-1]==s2[y-1])
				return LCS(x-1,y-1,s1,s2)+s1[x-1];
			else
				if(LCS(x-1, y,s1,s2).length()>LCS(x,y-1,s1,s2).length())
					return LCS(x-1, y,s1,s2);
				else
					return LCS(x,y-1,s1,s2);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		String y=sc.next();
		char[]s1=x.toCharArray();
		char[]s2=y.toCharArray();
		int X=x.length();
		int Y=y.length();
		System.out.print(LCS(X,Y,s1,s2));
	}
}