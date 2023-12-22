import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws IOException
	{
		int n,m,l;
		int i,j,k;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		String[] nml = br.readLine().split(" ");

		n = Integer.parseInt(nml[0]);
		m = Integer.parseInt(nml[1]);
		l = Integer.parseInt(nml[2]);
		
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		long[][] out = new long[n][l];

		for(i=0; i<n; i++)//get a
		{
			String[] str = br.readLine().split(" ");
			for(j=0; j<m; j++) a[i][j] = Integer.parseInt(str[j]);
		}

		for(i=0; i<m; i++)//get b
		{
			String[] str = br.readLine().split(" ");
			for(j=0; j<l; j++) b[i][j] = Integer.parseInt(str[j]);
		}


		for(i=0; i<n; i++)//calc
		{
			for(j=0; j<l; j++)
			{
				for(k=0; k<m; k++)
				{
					out[i][j] = out[i][j] + a[i][k]*b[k][j];
					
				}
				
				System.out.print(out[i][j] + ( (j==l-1) ? "" : " ") );
			}

			System.out.println();
		}
		

	}
	
	/*
	static void ShowMatrix(int[][] matrix, int n, int m)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				System.out.print(matrix[i][j]);
			}
			
			System.out.println();
		}
		
	}*/
	
}