import java.io.*;
import java.util.regex.*;
import java.util.*;

//import java.math.*;
public class Main {
 
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
      //  ArrayList <Double> student= new ArrayList <Double>(); 
//      double [] student =new double [(int)Math.pow(2, 16)-1];
     while(scan.hasNext()){
    	 String line =scan.nextLine();
    	 Pattern p = Pattern.compile("@(\\d)(.)");
    	
    	 Matcher m = p.matcher(line);
    	 String result ="";
    		 while(m.find()){
    		result = m.replaceFirst(repeat("$2",Integer.parseInt(m.group(1))));
    		 m = p.matcher(result);}
    		
    	
    	 
    	 System.out.println(result);
     }
     }
    public static String repeat(String s,int n){
    	String str ="";
    //	int m =Integer.parseInt(n);
    	for(int i=0;i<n;i++){
    		str=str.concat(s);
    	}
    	return str;
    }

     }