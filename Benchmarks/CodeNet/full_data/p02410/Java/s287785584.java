import java.util.Scanner;
public class Main{
	public static void main(String[] args){

        Scanner s = new Scanner(System.in);
		int i,j,n,m;				
        
        n = s.nextInt();
        m = s.nextInt();
        int[][] a = new int[n][m];
        
		for(i=0;i<n;i++)
            for(j=0;j<m;j++)
               a[i][j]  = s.nextInt();


        int[] b = new int[m];
        for(i=0;i<m;i++)
            b[i]  = s.nextInt();
				
        int[] c = new int[n];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
           		c[i]+=(a[i][j])*(b[j]);
            }
        }
        
        for(i=0;i<n;i++){
            System.out.println(c[i]);
        
        }
		s.close();
	}
}
