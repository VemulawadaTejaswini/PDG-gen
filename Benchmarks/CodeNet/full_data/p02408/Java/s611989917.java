import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        	String input = br.readLine();
        	int[][] sum = new int[4][13];
        	for (int i = 0; i < Integer.parseInt(input); i++)
        	{
            	String[] card = br.readLine().split(" ");
            		int k = Integer.parseInt(card[1]) - 1;
            		if (card[0].equals("S"))
            			sum[0][k] = 1;
            		if (card[0].equals("H"))
            			sum[1][k] = 1;
            		if (card[0].equals("C"))
            			sum[2][k] = 1;
            		if (card[0].equals("D"))
            			sum[3][k] = 1;
        	}
        	for (int i = 0; i < 4; i++)
        	{
        		for (int j = 0; j < 13; j++)
        		{
        			if (sum[i][j] != 1)
        			{
        				if (i == 0)
        					System.out.println("S " + (j + 1));
        				if (i == 1)
        					System.out.println("H " + (j + 1));
        				if (i == 2)
        					System.out.println("C " + (j + 1));
        				if (i == 3)
        					System.out.println("D " + (j + 1));
        			}
        		}
        	}
        	
        	
	}

}