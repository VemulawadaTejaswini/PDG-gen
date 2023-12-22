import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
  
  
  
public class Main {
    
    
    public static void main(String[] args) {
         
        try {
            
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
            String s;
            List<Integer> List = new ArrayList<Integer>();  
            
            int verticalNum = Integer.parseInt(br.readLine());
           
            for(int i = 1; i<=verticalNum; i++)
            {
            	List.add(i);
            }
            int horizontalNum = Integer.parseInt(br.readLine());
            
            for(int i = 0; i<horizontalNum; i++)
            {
            	s = br.readLine();
            	StringTokenizer st = new StringTokenizer(s,",");
            
            	int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1;
                int temp = 0;
                
                temp = List.get(a);
                List.set(a,List.get(b));
                List.set(b, temp);
                     
            }
            
            for(int i = 0; i<List.size(); i++)
            {
            	System.out.println(List.get(i));
            }
     
        }catch (Exception e) {
            e.printStackTrace();
        }
         
    }
    
   
    
  
}