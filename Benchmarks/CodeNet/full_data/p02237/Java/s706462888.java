import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());

	int matrix[][]=new int[n][n];

	for(int i=0;i<n;i++){
	    String str[]=br.readLine().split(" ");

	    int u=Integer.parseInt(str[0])-1;
	    int k=Integer.parseInt(str[1]);
	    for(int j=2;j<2+k;j++){
		int v=Integer.parseInt(str[j])-1;
		matrix[u][v]=1;
	    }

	    for(int j=0;j<n;j++){
		if(j==0)
		    System.out.print(matrix[i][j]);
		else
		    System.out.print(" "+matrix[i][j]);
	    }
	    System.out.println();
	}
    }
}

