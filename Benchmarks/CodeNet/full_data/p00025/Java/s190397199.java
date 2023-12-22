import java.io.*;
import java.util.StringTokenizer;



public class Main {
	
	
    public static void main(String[] args) {
       
    	try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String s1 , s2;
           
            int arrayA[] = new int[4];
            int arrayB[] = new int[4];
            
            s1 = br.readLine();
            StringTokenizer st1 = new StringTokenizer(s1," ");
            for(int i = 0; i<4; i++)
            {
            	arrayA[i] = Integer.parseInt(st1.nextToken());
            }
            
            
            s2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(s2," ");
            for(int i = 0; i<4; i++)
            {
            	arrayB[i] = Integer.parseInt(st2.nextToken());
            }
            System.out.println(calHit(arrayA,arrayB)+" "+calFlow(arrayA,arrayB));
          
    	}catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    
    private static int calHit(int arrayA[],int arrayB[]) {
    	
    	 int hit = 0;
    	 
    	for(int i = 0; i<4; i++)
    	{
    		if(arrayA[i] == arrayB[i])
    		{
    			hit++;
    		}			
    	}
    	return hit;
    	
    }
    
    private static int calFlow(int arrayA[],int arrayB[]) {
    	
   	 int flow = 0;
   	 
   	for(int i = 0; i<4; i++)
   	{
   		for(int a = 0; a<4; a++)
   		{
   			if(i != a)
   			{
   				if(arrayA[i]==arrayB[a])
   				{
   					flow++;
   				}
   			}
   		}
   	
   }
   	return flow;
    }
}