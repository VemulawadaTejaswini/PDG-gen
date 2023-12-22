import java.util.Scanner;
public class Main {
	static int N=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,j,k,l,n,m[][]=new int[N+1][N+1],p[]=new int[N+1];
       Scanner sca =new Scanner(System.in);
       n=sca.nextInt();
       for(i=0;i<n;i++){
    		   p[i]=sca.nextInt();
    		   p[i+1]=sca.nextInt();
    		   m[i+1][i+1]=0;
    	   }
       for(k=2;k<=n;k++){
    	   for(i=1;i<=n-k+1;i++){
    		   j=i+k-1;
    		   m[i][j]=Integer.MAX_VALUE;
    		   for(l=i;l<=j-1;l++){
    			   if(m[i][l]+m[l+1][j]+p[i-1]*p[l]*p[l]<m[i][j]){
    				   m[i][j]=m[i][l]+m[l+1][j]+p[i-1]*p[l]*p[l];
    			   }
    		   }
    	   }
       }
       System.out.println(m[1][n]);
       }
	}

