
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static int ans=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		int N=Integer.valueOf(cmd[0]);
		int[][] array=new int[N][3];
		for(int i=0;i<N;i++)
		{
			cmd=br.readLine().split(" ");
			for(int j=0;j<3;j++)
			{
				array[i][j]=Integer.valueOf(cmd[j]);
			}
		}
		maxH(array,-1,0,N,0);
		System.out.println(ans);
	}

	private static void maxH(int[][] array,int x,int y,int N,int sum) {
		// TODO Auto-generated method stub
		if(y==N)
		{
			if(sum>ans)
				ans=sum;
			return;
		}
		for(int i=0;i<3;i++)
		{
			if(i!=x) {
			maxH(array,i,y+1,N,sum+array[y][i]);}
		}
	}
}
