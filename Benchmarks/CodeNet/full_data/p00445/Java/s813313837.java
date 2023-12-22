import java.io.*;
public class Main {
	 public static void main (String[] args) throws IOException	{
		 InputStreamReader is = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(is);                    
	     int joi=0,ioi=0;
	     String str="";
	     while((str=br.readLine()) != null){
	    	 str= br.readLine();
	    	 for(int i=0;i<str.length()-1;i++){
	    		 if(str.charAt(i)=='J'){
	    			 if(str.charAt(i+1)=='O'){
	    				 if(str.charAt(i+2)=='I'){
	    					 joi++;
	    				 }
	    			 }
	    		 }
	    		 else if(str.charAt(i)=='I'){
	    			 if(str.charAt(i+1)=='O'){
	    				 if(str.charAt(i+2)=='I'){
	    					 ioi++;
	    				 }
	       			}
	       		}
	     	}
	     	System.out.println(joi);
	    	System.out.println(ioi);
	     }
	     br.close();
	 }
}