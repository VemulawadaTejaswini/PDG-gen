import java.util.Scanner;


public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		String y=sc.next();
		int inx=0;
		int [][]L=new int[x.length()+1][y.length()+1];
		for(int i=0;i<=x.length();i++){
			for(int j=0;j<=y.length();j++){
				if(i==0||j==0)
					L[i][j]=0;
				else
					if(x.charAt(i-1)==y.charAt(j-1))
						L[i][j] = L[i-1][j-1] + 1; 
					else
						L[i][j]=Math.max(L[i][j-1],L[i-1][j]);
				inx=L[i][j];
			}
		}char[]c=new char[inx+1];
		c[inx]=' ';
		for(int i=x.length(),j=y.length();i>0&&j>0;){
			if(x.charAt(i-1)==y.charAt(j-1)){
				c[inx-1]=x.charAt(i-1);
				i--;j--;inx--;
			}else if(L[i-1][j]>L[i][j-1])
				i--;
			else
				j--;
		}for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
	}
}