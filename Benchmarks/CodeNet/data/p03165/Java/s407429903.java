import java.util.Scanner;


public class Main {
	public static String LCS(int x,int y,char[]s1,char[]s2){
		String L[][]=new String[x+1][y+1];
		int i,j = 0;
		for(i=0;i<=x;i++){
			for(j=0;j<=y;j++){
				if(i==0||j==0)
					L[i][j]="";
				else
					if(s1[i-1]==s2[j-1])
						L[i][j]=""+L[i-1][j-1]+s1[i-1];
					else
						if(((String)L[i-1][j]).length()>((String)L[i][j-1]).length())
							L[i][j]=L[i-1][j];
						else
							L[i][j]=L[i][j-1];
			}
		}			return L[i-1][j-1];
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