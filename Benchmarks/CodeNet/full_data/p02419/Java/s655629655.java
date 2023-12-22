import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main{
     public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	String W;
    	String T;
    	String change_W = "";
    	String change_T = "" ;
    	String end = "END_OF_TEXT";
    	int count = 0;
    	int find = 0;
    	
    	
    	W = scan.nextLine();
    	change_W = W.toLowerCase();
    	
    	for(;;){
        	T = scan.nextLine();
    		if(T.equals(end)) break;
    		
    		change_T = T.toLowerCase();
    		Pattern p = Pattern.compile(change_W);
    		Matcher m = p.matcher(change_T);
    		
    		while(m.find()){
    			count++;
    		}
    	}
    	
    	 System.out.println(count);
     }
    	
}