import java.io.*;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) {
       
    	try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(getGreatest(a,b));
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    public static long getGreatest(int a,int b) {
        
        int min_num = Math.min(a, b);
        for(int d = min_num; d>0; d--)
        {
             if(a%d==0 && b%d==0)
             {
                 return d;
             }
    
        }
       return 0; 
         
       }

}