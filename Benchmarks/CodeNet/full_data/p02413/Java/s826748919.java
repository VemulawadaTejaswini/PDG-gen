import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] in=br.readLine().split(" ");
		int r=Integer.parseInt(in[0]);
		int c=Integer.parseInt(in[1]);
		int array[][]=new int[r+1][c+1];
		int sum;
		for(int i=0;i<r;i++){
			in=br.readLine().split(" ");
			for(int j=0;j<c;j++)
				array[i][j]=Integer.parseInt(in[j]);
		}
		for(int i=0;i<r;i++){
			sum=0;
			for(int j=0;j<c;j++)
				sum+=array[i][j];
			array[i][c]=sum;
		}
		for(int i=0;i<=c;i++){
			sum=0;
			for(int j=0;j<r;j++)
				sum+=array[j][i];
			array[r][i]=sum;
		}
		for(int i=0;i<=r;i++){
			System.out.print(array[i][0]);
			for(int j=1;j<=c;j++)
				System.out.print(" "+array[i][j]);
			System.out.println("");
		}
	}
}