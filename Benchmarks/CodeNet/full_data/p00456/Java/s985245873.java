import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args)throws IOException{
		Scanner scan = null;
		int [][] point = new int[2][10];
		try{
			scan = new Scanner(System.in);
			for(int i = 0 ; i < point.length;i++)
				for(int j = 0; j < point[i].length;j++)
					point[i][j] = scan.nextInt();
			Arrays.sort(point[0]);
			Arrays.sort(point[1]);
			int[] sum = new int[2];
			for(int i = 9; i > 6;i--)
				for(int j = 0 ; j < sum.length;j++)
					sum[j] += point[j][i];
			System.out.printf("%d %d\n",sum[0],sum[1]);
		}finally{
			if(scan !=null)scan.close();
		}
	}
}