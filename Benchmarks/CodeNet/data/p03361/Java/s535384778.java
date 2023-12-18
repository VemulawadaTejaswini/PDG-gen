import java.util.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int flag=0;

		char s[][]=new char[52][52];

		for(int i=0;i<=w+1;i++){
			for(int j=0;j<=h+1;j++) s[i][j]='.';
		}

		for(int i=1;i<=w;i++){
			String str=sc.next();
			for(int j=1;j<=h;j++){
				s[i][j]=str.charAt(j-1);
			}
		} 

		for(int i=1;i<=w;i++){
			for(int j=1;j<=h;j++){
				if(s[i][j]=='#' && s[i-1][j]=='.' && s[i+1][j]=='.' && s[i][j-1]=='.' && s[i][j+1]=='.') flag=1;
			}
		} 

		if(flag==0) System.out.println("Yes");
		else System.out.println("No");
	}
}