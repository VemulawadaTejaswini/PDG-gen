import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			char [][] a=new char[20][20];
			for(int i=0;i<20;i++)
				for(int j=0;j<20;j++)
					a[i][j]='0';
			for(int i=0;i<8;i++){
				String now=s.next();
				for(int j=0;j<8;j++)
					a[i][j]=now.charAt(j);
			}
			char ans=' ';
			
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(a[i][j]=='1'&&a[i][j+1]=='1'&&a[i+1][j]=='1'&&a[i+1][j+1]=='1')ans='A';
					if(a[i][j]=='1'&&a[i+1][j]=='1'&&a[i+2][j]=='1'&&a[i+3][j]=='1')ans='B';
					if(a[i][j]=='1'&&a[i][j+1]=='1'&&a[i][j+2]=='1'&&a[i][j+3]=='1')ans='C';
					if(a[i][j+1]=='1'&&a[i+1][j+1]=='1'&&a[i+1][j]=='1'&&a[i+2][j]=='1')ans='D';
					if(a[i][j]=='1'&&a[i][j+1]=='1'&&a[i+1][j+1]=='1'&&a[i+1][j+2]=='1')ans='E';
					if(a[i][j]=='1'&&a[i+1][j]=='1'&&a[i+1][j+1]=='1'&&a[i+2][j+1]=='1')ans='F';
					if(a[i][j+1]=='1'&&a[i][j+2]=='1'&&a[i+1][j+1]=='1'&&a[i+1][j]=='1')ans='G';
				}
			}
			System.out.println(""+ans);
		}
	}
}