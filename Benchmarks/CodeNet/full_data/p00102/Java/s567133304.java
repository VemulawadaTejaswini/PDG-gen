import java.util.*;

public class a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int all_sum =0;
		while( true )
		{
		
			String n = in.nextLine();
			int length = Integer.parseInt(n);
			
			if(length == 0){
				break;
			}
			
			int col_sum[] = new int[length];
			
			for(int i=0; i<length; i++)
			{
				String buf = in.nextLine();
				String val[] = buf.split(" ");
				int array[][] = new int[length][val.length];
				int line_sum = 0;
				
				for(int j=0; j<val.length; j++){
					array[i][j] = Integer.parseInt(val[j]);
					System.out.printf("%5d",array[i][j]);
					line_sum += array[i][j];
					col_sum[j] += array[i][j];
				}
				System.out.printf("%5d\n",line_sum);
				all_sum += line_sum;
			}
			for(int k=0; k<col_sum.length; k++)
			{
				System.out.printf("%5d", col_sum[k]);
			}
			System.out.printf("%5d\n",all_sum);
			all_sum = 0;
		}
	}
}