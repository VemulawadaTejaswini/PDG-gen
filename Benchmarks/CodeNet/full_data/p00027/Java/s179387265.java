import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) {
       
    	try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String s;
            int a , b;
            s = br.readLine();
           
            	StringTokenizer st = new StringTokenizer(s," ");
            	a = Integer.parseInt(st.nextToken());
            	b = Integer.parseInt(st.nextToken());     
            	if(a==0 || b==0)
            	{
            		System.exit(0);
            	}
            	System.out.println(calDay(a,b));
           
            
    	}catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    
    private static String calDay(int month,int date) {
    	
    	int year = 2004;
    	int h = 0;
    	
    	
    	ArrayList<String> dayList = new ArrayList<String>();
    	dayList.add("Saturday");
    	dayList.add("Sunday");
    	dayList.add("Monday");
    	dayList.add("Tuesday");
    	dayList.add("Wednesday");
    	dayList.add("Thursday");
    	dayList.add("Friday");
    	
    	if(month ==1 || month==2)
    	{
    		month += 12;
    		year = year - 1;
    	}
    	
    	int C = (int)Math.floor(year/100);
    	int Y = year%100;
    	
    	h = (5*C + Y + (int)Math.floor(Y/4) + (int)Math.floor(C/4) + (int)Math.floor(26*(month+1)/10) + date) % 7;
    	
    	return dayList.get(h);
    }

}