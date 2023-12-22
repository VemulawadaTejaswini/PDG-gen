import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{

	public static void main(String[] args) throws IOException
	{
		int m;
		String strSub;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        while(true)
        {
    		String str = br.readLine();
    		
    		if(str.equals("-") ) break;
    		
    		String strM = br.readLine();
    
    		m = Integer.parseInt(strM);
    		int[] h = new int[m];
    		
    		for(int i=0; i<m; i++)
            {
                String strH = br.readLine();
                h[i] = Integer.parseInt(strH);
                
        		strSub = str.substring(0, h[i]);
        
        		str = str + strSub;
        		
        		strSub = str.substring(h[i]);
        		str = null;//init string
        		str = strSub;
        		//System.out.println(strSub);
            }
            System.out.println(str);
            
        }
	}
}