import java.io.*;
import java.util.*;

public class Main{

    static int matrix[][];
    static int p[];
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());

	matrix=new int[n+1][n+1];
	p=new int[n+1];

	for(int i=1;i<=n;i++){
	    String str[]=br.readLine().split(" ");

	    int r=Integer.parseInt(str[0]);
	    int c=Integer.parseInt(str[1]);

	    p[i-1]=r;
	    p[i]=c;
	}
	matrixCM(n);

	System.out.println(matrix[1][n]);
    }

    static void matrixCM(int n){
	for(int i=1;i<=n;i++){
	    matrix[i][i]=0;
	}

	for(int l=2;l<=n;l++){
	    for(int i=1;i<=n-l+1;i++){
		int j=i+l-1;
		matrix[i][j]=Integer.MAX_VALUE;
		for(int k=i;k<j;k++){
		    matrix[i][j]=Math.min(matrix[i][j],matrix[i][k]+matrix[k+1][j]+p[i-1]*p[k]*p[j]);
		}
	    }
	}
    }
}

