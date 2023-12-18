import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int flag=0;
		String str;

		int s[][]=new int[h+2][w+2];

		for(int i=0;i<=w+1;i++){
			for(int j=0;j<=h+1;j++) s[i][j]=0;
		} 

		for(int i=1;i<=w;i++){
			str=sc.next();
			for(int j=1;j<=h;j++){
				char input = str.charAt(j-1);
				if(input=='#') s[i][j]=1;
				else s[i][j]=0;
			}
		} 

		for(int i=1;i<=w;i++){
			for(int j=1;j<=h;j++){
				if(s[i][j]==1 && !(s[i][j]==s[i-1][j] || s[i][j]==s[i+1][j] || s[i][j]==s[i][j-1] || s[i][j]==s[i][j+1])){
					flag=1;
				}
			}
		} 

		if(flag==0) System.out.println("Yes");
		else System.out.println("No");
	}
}