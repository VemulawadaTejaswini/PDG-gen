import java.io.*;
public class Main {
	 public static void main (String[] args) throws IOException	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                  
	     int joi,ioi;
	     byte[] line;
	     String str="";
	     while((str=br.readLine()) != null){
	    	 line=str.getBytes();
	    	 joi=0;
	    	 ioi=0;
	    	 for(int i=0;i<line.length-2;i++){
	    		 if(str.charAt(i)=='J'&&str.charAt(i+1)=='O'&&str.charAt(i+2)=='I')	joi++;
	    		 if(str.charAt(i)=='I'&&str.charAt(i+1)=='O'&&str.charAt(i+2)=='I') ioi++;
	    	 }
	    	 System.out.println(joi);
	    	 System.out.println(ioi);
	     }
	 }
}