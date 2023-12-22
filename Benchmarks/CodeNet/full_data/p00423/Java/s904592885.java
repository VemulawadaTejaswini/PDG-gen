import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner scanf =new Scanner (System.in);
	int[][] a =new int[100][5000];
	int [][] b=new int[100][5000];
	int[][]s=new int[5000][2];
	
	int x=scanf.nextInt(),i,k=0;
	
	while(x!=0){
		for (i=0; i<x ;i++){
			a[i][k]=scanf.nextInt();b[i][k]=scanf.nextInt();
			
		if(a[i][k]>b[i][k]) s[k][0]+=a[i][k]+b[i][k];
		else if (a[i][k]<b[i][k]) s[k][1]+=a[i][k]+b[i][k];
		else {s[k][0]+=a[i][k]; s[k][1]+=b[i][k];}
	}
	k++;x=scanf.nextInt();}
	
	for (i=0;i<k;i++)
	System.out.println(s[i][0]+" "+s[i][1]);
	}
}