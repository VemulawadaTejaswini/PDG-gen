import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args)throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		??????A????????°??¨?????°?????????
		String[] strs = br.readLine().split(" ");
		int a_row = Integer.parseInt(strs[0]);
		int a_col = Integer.parseInt(strs[1]);
//		??\??????????????°??????????????????A??¨B?????????
		int[][] a = new int[a_row][a_col];
		int[] b = new int[a_col];
		
		String[] buf = new String[a_col];
//		??????A
		for(int row=0; row<a.length; row++)
		{
			buf = br.readLine().split(" ");
			for(int col=0; col<a[a_row].length; col++)
			{
				a[row][col] = Integer.parseInt(buf[col]);
			}
		}
//		?¬????B
		for(int col=0; col<a_col; col++)	b[col] = Integer.parseInt(br.readLine());
//		A*B????????????C???????´?
		int[] c = new int[a_row];
		int sum = 0;
		for(int row=0; row<a.length; row++)
		{
			for(int col=0; col<a[a_row].length; col++)
			{
				sum += a[row][col] * b[col];
			}
			c[row] = sum;
			sum = 0;
		}
//		C?????????????????????
		for(int row=0; row<c.length; row++)
		{
			System.out.print(c[row]);
			if(row!=c.length-1) System.out.println();
		}
	}
}