import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
    	   	                                                 
    	String W = reader.readLine();
    	String Tall = "";
    	
    	while(true){
    	String T = reader.readLine();
    	String low_T = T.toLowerCase();
    	if(low_T.equals("end_of_text")){
    		break;
    	}
    	else{
        Tall = Tall + low_T; 
    	}
    	}
        int sum = 0;
        
        
        String [] item = Tall.split(" ");
        
        
        for(int itemNum = 0; itemNum < (item.length); itemNum++){
            if(item [itemNum].equals(W)){
            sum++;
            }
            else{
            }
        }
        System.out.println(sum);
    }
}