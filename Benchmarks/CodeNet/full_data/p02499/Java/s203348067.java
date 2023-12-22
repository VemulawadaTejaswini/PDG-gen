import java.util.Scanner;  
public class Main {  
	public static void main(String[] args){  
	    Scanner input=new Scanner(System.in);
	    while(input.hasNextLine()){
	    String s=input.nextLine();  
	   
	    
	    int[] counts=countLetters(s.toLowerCase());  
	        
	    if(counts.length<1200){
	    	for(int i=0;i<counts.length;i++){  
	    		if(counts[i]!=0){ 
	    			System.out.println((char)('a'+i)+" : "+counts[i]);  
	    		}
	    		else{
	    			System.out.println((char)('a'+i)+" : "+0);
	    		}
	    	}
	    }  
	    }
	
}
	
		public static int[] countLetters(String s){  
			int[] counts=new int[26];
	    
			for(int i=0;i<s.length();i++){  
				if(Character.isLetter(s.charAt(i)))  
					counts[s.charAt(i)-'a']++;  
			}  
	        	return counts;  
	    	}  
		
}  