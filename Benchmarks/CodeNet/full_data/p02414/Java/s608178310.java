import java.util.Scanner;

class Main{
    public static void main(String[] args){
	final Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int l=sc.nextInt();
	int[][] A=new int[n][m];
	int[][] B=new int[m][l];

	for(int i=0;i<n;i++)
	    for(int j=0;j<m;j++)  A[i][j]=sc.nextInt();
	    for(int i=0;i<m;i++){
		for(int j=0;j<l;j++){
		    B[i][j]=sc.nextInt();
		}
	    }
	    int c;
	for(int i=0;i<n;i++){
	    for(int j=0;j<l;j++){
		c=0;
		for(int k=0;k<l;k++){
		    c+=A[i][k]*B[k][j]
		}
		System.out.print(c);
		if(j!=l-1)System.out.print(" ");
		
	    }
	    System.out.println("");
	}
    }
}