import java.io.*;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) {
       
    	try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String s;
            int a , b ,temp;
            int r = 0;
            while((s = br.readLine())!=null)
            {
            StringTokenizer st = new StringTokenizer(s," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
        
            if(a>=100000 || b>=100000)
            {
            	System.out.println("??°??????100000??\????????\??????????????????");
            	
            }
            	if(a<b)
            	{
            		temp = a;
            		a = b;
            		b = temp;
            	}
            
            	while(b!=0)
            	{
            		r = a%b;
            		a = b;
            		b = r;
            		
            	}
            	System.out.println(a);
            	
            }
    	}catch (Exception e) {
            e.printStackTrace();
        }
       
    }
   

}