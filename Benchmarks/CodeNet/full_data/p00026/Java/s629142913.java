

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int[][] mat=new int[10][10];
	for(int i=0;i<10;i++)
		for(int j=0;j<10;j++) {
			mat[i][j]=0;
		}
	String str;
	while((str=in.readLine())!=null && str.length()!=0) {
		List<String> s=Arrays.asList(str.split(","));
		int x=Integer.parseInt(s.get(0));
		int y=Integer.parseInt(s.get(1));
		int size=Integer.parseInt(s.get(2));
		if(size==1) {
			for(int i=x-1;i<=x+1 && i>=0  && i <10 ;i++)
				mat[i][y]+=1;
			for(int i=y-1;i<=y+1 && i>=0  && i <10 ;i++)
				mat[x][i]+=1;
		}
		if(size>=2) {
			for(int i=x-1;i<=x+1;i++) 
				for(int j=y-1;j<=y+1;j++) {
					if(i<10 && i>=0 && j<10 && j>=0)
						mat[i][j]+=1;
				}
		}
		if(size==3) {
			if((x-2)>=0)
				mat[x-2][y]+=1;
			if((x+2)<10)
				mat[x+2][y]+=1;
			if((y-2)>=0)
				mat[x][y-2]+=1;
			if((y+2)<10)
				mat[x][y+2]+=1;
		}
		
		
	}
	int num_zero=0;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<10;i++)
		for(int j=0;j<10;j++) {
			if(mat[i][j]==0)
				num_zero++;
			if(mat[i][j]>max)
				max=mat[i][j];
		}
	
	System.out.println(num_zero);
	System.out.println(max);
}

}