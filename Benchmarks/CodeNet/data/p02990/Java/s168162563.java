

import java.util.Scanner;

public class Main {
	static int bin[][]=new int[2001][2001];
	static int binomialCoeff(int n, int k)  
    { 
      
        // Base Cases 
        if (k == 0 || k == n) 
            return 1; 
          
        // Recur 
//        if(bin[n][k]!=-1)return bin[n][k];
        return bin[n][k]=(binomialCoeff(n - 1, k - 1) +  
                    binomialCoeff(n - 1, k))%1000000007; 
    } 
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int bin[][]=new int[2001][2001];
		for(int i=0;i<2001;i++)
		{
			for(int j=0;j<2001;j++)
			{
				bin[i][j]=-1;
			}
		}
		int n=scan.nextInt();
		int k=scan.nextInt();
		int red=n-k+1;
		int bule=k-1;
//		System.out.println(binomialCoeff(6,4));
		for(int i=1;i<=k;i++)
		{
			long gg=(binomialCoeff(red,i)*1L*binomialCoeff(bule,i-1))%1000000007;
			System.out.println(gg);
		}
	}
}
