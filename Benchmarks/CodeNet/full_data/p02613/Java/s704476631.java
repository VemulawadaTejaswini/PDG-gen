import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] input = new String[n];
        
        for(int i = 0; i < n; i++){
            input[i] = br.readLine();
        }
        
        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;
        
        for(int i = 0; i < n; i++){
            switch(input[i]){
		        case "AC" :
		            ac++;
		            break;
		    
		        case "WA" :
		            wa++;
		            break;
		    
		        case "TLE" :
		            tle++;
		            break;
		    
		        case "RE" :
		            re++;
		            break;
		        
		        default : 
		            break;
            }
        }
        
        out.println("AC x " + ac);
        out.println("WA x " + wa);
        out.println("TLE x " + tle);
        out.println("RE x " + re);
         
        out.close();
        
    }
}