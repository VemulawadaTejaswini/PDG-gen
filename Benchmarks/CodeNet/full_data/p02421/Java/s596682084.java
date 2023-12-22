import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
    	int kaisu = Integer.parseInt( br.readLine());
    	int tpoint = 0;
    	int hpoint = 0;
    	for (int i = 0; i < kaisu; i++)
    	{
    		String[] card = br.readLine().split(" ");
    		String taro = card[0];
    		String hanako = card[1];
    		
    		for (int j = 0; j < taro.length(); j++)
    		{
    			if (taro.charAt(j) > hanako.charAt(j))
    			{
    				tpoint += 3;
    				break;
    			}
    			else if (taro.charAt(j) < hanako.charAt(j))
    			{
    				hpoint += 3;
					break;
    			}
    			if (j == taro.length() - 1)
    			{
    				if (taro.length() == hanako.length())
    				{
    					tpoint += 1;
    					hpoint += 1;
    				}
    				else if (taro.length() < hanako.length())
    					hpoint += 3;
    				break;
    			}
    		}
    	}
		System.out.println(tpoint + " " + hpoint);	
	}

}