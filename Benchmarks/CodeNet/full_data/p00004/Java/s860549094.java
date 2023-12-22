import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		int[][] a = new int[2][6];
		String str ;
		String[] result;
		double x,y;
		
	
		for(int i = 0;i <a.length;i++)
		{
			result = s.nextLine().split(" ");
			for(int j = 0; j < a[i].length;j++)
			{
				a[i][j] = Integer.parseInt(result[j]);
			}
			
		}
		
		for(int i = 0;i<a.length;i++)
		{
			 y = (a[i][2]*a[i][3]-a[i][5]*a[i][0])/(a[i][1]*a[i][3]-a[i][4]*a[i][0]);
			 x = (a[i][2]-a[i][1]*y)/a[i][0];
			 System.out.printf("%.3f %.3f\n",x,y);


		}
	}
}