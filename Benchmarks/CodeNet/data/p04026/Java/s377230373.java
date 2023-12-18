import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
	  static int mod=1000000007;
      public static void main(String[] args) {
    	  Scanner in=new Scanner( new BufferedReader(new InputStreamReader(System.in)))	;
    	  String string=in.next();
    	  int n=string.length();
    	  TreeMap<Character, Integer> map=new TreeMap<Character, Integer>(); 
    	  int l=0,r=0;
    	  long num=0;
    	  while(true)
    	  {
    		  while(r<n)
    		  {
    			 if(map.containsKey(string.charAt(r)))
    			 {
    				 map.put(string.charAt(r), map.get(string.charAt(r))+1);
    				  //System.out.println(string.charAt(r)+" "+map.get(string.charAt(r)));
    				 //System.out.println(l+" "+r);
    				  if(map.get(string.charAt(r))>=(r-l+1)/2+1)
    				 {
    					 System.out.println((l+1)+" "+(r+1));
    					 return;
    				 }
    			 }
    			 else
    				 map.put(string.charAt(r), 1);
    			 r++;
    		  }
    		  map.put(string.charAt(l), map.get(string.charAt(l))-1);
    		  l++;
    		  if(l>=r) break;
     	  }
    	  System.out.println("-1 -1");
    	  
      }
}
