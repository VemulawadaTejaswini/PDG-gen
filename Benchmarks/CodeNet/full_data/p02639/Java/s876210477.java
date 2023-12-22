 import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import javax.sound.sampled.ReverbType;

public class Main {

	 static Scanner scan=new Scanner(System.in);
	 static int cnt=0;
	 static int M=(int)1e9+7;
	static boolean issamedi(int i,int j){
		if(i>0&&j<0)
			return false;
		if(i>0&&j>0&&i>j)
			return false;
		return true;
		
		
	}

	
		static boolean isvowel(char c) {
			return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
			
		}
	 public static int maxVowels(String s, int k) {
	        int i=0;
	        ArrayList<Integer>lenghts=new ArrayList<Integer>();
	        for(int j=0;j<s.length();j++) {
	        	if(i==k)
	        		i=0;
	        	if(!isvowel(s.charAt(j)))
	        		i=0;
	        	if(isvowel(s.charAt(j))) {
	        		i++;
	        		lenghts.add(i);
	        		}
	        	
	        }
	        try {
	        return Collections.max(lenghts);
	        }
	        catch (NoSuchElementException e) {
	        return 0;}
	    }
	
	 static int convert(int n) {
		 String s=String.valueOf(n);
		 String s1="";
		 s1+=s.charAt(0);
		 int c=0;
		 for(int i=1;i<s.length();i++)
		 s1+='0';
		 return Integer.parseInt(s1);
	 }
	 static  boolean ispositive(ArrayList<Integer>ar) {
		 for(int i=0;i<ar.size();i++) {
			 if(ar.get(i)>0)
				 return true;
			 }
		 return false;
		 
	 }
	public static void main(String[] args) throws IOException {
int sum=0;
		for(int i=0;i<5;i++) {
			int a=scan.nextInt();
			sum+=a;
			
		}
		System.out.println((5*(5+1)/2)-sum);
		
		
 }




	
	

	
	

	

	
}
