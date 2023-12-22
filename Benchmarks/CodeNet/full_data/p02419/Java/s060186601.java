import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
    	String w = br.readLine();
    	int count = 0;
    	
    	while (true)
    	{
    		String s = br.readLine();
    		if (s.equals("END_OF_TEXT"))
    			break;
        	
        	for (int i = 0; i < s.length(); i++)
        	{
        		if (w.charAt(0) == s.charAt(i))
        			if (i + w.length() < s.length())
        				if (w.equals(s.substring(i, i + w.length() )))
                    		count++;
        	}
    	}
    	
    	System.out.println(count);
	}

}