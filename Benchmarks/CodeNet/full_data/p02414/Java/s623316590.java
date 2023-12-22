import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	int n,m,l;
	Scanner in =new Scanner(System.in);
	n = in.nextInt();
	m = in.nextInt();
	l = in.nextInt();

	int[][] A = new int[n][m];
	int[][] B = new int[m][l];
	int[][] C = new int[n][l];

	// fill A
	for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
		A[i][j] = in.nextInt();
	    }
	}

	// fill B
	for(int i=0;i<m;i++){
	    for(int j=0;j<l;j++){
		B[i][j] = in.nextInt();
	    }
	}


       	for(int i=0;i<n;i++){
	    for(int k=0;k<l;k++){
		C[i][k]=0;
		for(int j=0;j<m;j++){
		    C[i][k]+=A[i][j]*B[j][k];
		}
	    }
	}

	
	for(int i=0;i<n;i++){
	    for(int k=0;k<l;k++){
		System.out.print(C[i][k]);
		if(k!=l-1)System.out.print(" ");
	    }
	    System.out.println();
	}
    }
}
	   

	
	    
	
	

