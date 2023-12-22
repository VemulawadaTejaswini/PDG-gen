import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		String[] nANDmStr = input.readLine().split(" ");
		
		int[] nANDm = new int[nANDmStr.length];
		
		for(int insert = 0; insert < nANDmStr.length; insert++)
		{
			nANDm[insert] = Integer.parseInt(nANDmStr[insert]);
		}
		
		int[][] matrix = new int[nANDm[0]][nANDm[1]];
		
		for(int row = 0; row < matrix.length; row++)
		{
			String[] matrixStr = input.readLine().split(" ");
			
			for(int column = 0; column < matrixStr.length; column++)
			{
				matrix[row][column] = Integer.parseInt(matrixStr[column]);
			}
		}

		
		String[] vectorStr = new String[nANDm[1]];
		
		int[] vector = new int[vectorStr.length];
		
		for(int insert = 0; insert < vector.length; insert++)
		{
			vectorStr[insert] = input.readLine();
			
			vector[insert] = Integer.parseInt(vectorStr[insert]);
		}
		
		for(int row = 0; row < nANDm[0]; row++)
		{
			int solution = 0;
			
			for(int column = 0; column < nANDm[1]; column++)
			{
				solution = matrix[row][column] * vector[column] + solution;
			}
			
			System.out.println(solution);
		}
	}

}

