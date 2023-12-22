import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        	String input = br.readLine();
        	String[] inputan = br.readLine().split(" ");
        	List<String> an =Arrays.asList(inputan);
        	Collections.sort(an);
        	Collections.reverse(an);
        	int i = 0;
        	for (String san: an)
        	{
        		System.out.print(san);
        		if (i < Integer.parseInt(input) - 1)
        			System.out.print(" ");
        		if (i == Integer.parseInt(input) - 1)
        			System.out.println();
        		i++;
        	}
        	
	}

}