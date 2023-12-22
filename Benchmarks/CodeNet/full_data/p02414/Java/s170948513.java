import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int n=Integer.parseInt(str[0]);
		int m=Integer.parseInt(str[1]);
		int l=Integer.parseInt(str[2]);
		int[][] a=new int [n][m];
		int[][] b=new int [m][l];
		int[][] c=new int [n][l];

		for(int i=0;i<n;i++){
    		str=br.readLine().split(" ");
            for(int j=0;j<m;j++){
                a[i][j]=Integer.parseInt(str[j]);
            }
        }//配列a[][]に格納
                 
        for(int i=0;i<m;i++){
            str=br.readLine().split(" ");
            for(int j=0;j<l;j++){
            	b[i][j]=Integer.parseInt(str[j]);
            }
        }//配列b[][]に格納
		
		for(int i=0;i<n;i++){
			for(int j=0;j<l;j++){
				for (int k=0;k<m;k++){
					c[i][j] += a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+ " ");
			}
			System.out.print("\n");
		}

	}

}