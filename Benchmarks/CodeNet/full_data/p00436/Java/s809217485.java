import java.util.*;

class Main
{
    public static void main(String[] args)
    {
	int n,m,k;
	int[] A = new int[105];
	int[] B = new int[105];
	Scanner in = new Scanner(System.in);

	n = in.nextInt();
	for(int i=1;i<=2*n;i++)A[i] = i;
	m = in.nextInt();
	for(int i=0;i<m;i++)
	    {
		k = in.nextInt();
		if(k == 0)
		    {
			int d = 1;
			for(int j=1;j<=2*n;j+=2)
			    {
				//System.out.println("j = " + j);
				if(j != 1)d++;;
				B[j] = A[d];
				B[j+1] = A[n+d];
				//for(int l=1;l<=2*n;l++)System.out.println(B[l]);
			    }		
			for(int j=1;j<=2*n;j++)A[j] = B[j];
			//for(int l=1;l<=2*n;l++)System.out.println(B[l]);
		    }
		else
		    {
			for(int j=1;j<=2*n;j++)
			    {
				if(j<=k)
				    {
					B[(2*n-k)+j] = A[j];
				    }
				else    B[j - k] = A[j];

			    }
			for(int j=1;j<=2*n;j++)A[j] = B[j];
			//for(int l=1;l<=2*n;l++)System.out.println(B[l]);
		    }


	    }

	for(int i=1;i<=2*n;i++)System.out.println(A[i]);
    }
}