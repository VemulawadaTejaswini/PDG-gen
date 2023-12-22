import java.util.*;
import java.io.*;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		String dam;
		String str = "";
		
		int alf[];
		char line;
		char hika;
		alf = new int[26];
		
				
		while(as.hasNext()){
			
			str = str + as.nextLine();
			
		}
		
		dam = str;
		dam = dam.toUpperCase();
		
		for(int i=0;i<str.length();i++){      //
            
            line = str.charAt(i);
            hika = dam.charAt(i);
            if(line - 'A' >= 0){
            	if(line == hika ){
            		
            		alf[line-'A'] += 1;
            		
            	}
            	else{
            	
            		alf[line-'a'] += 1;
            		
            	}
            	
            }
             
        }
		
		line = 'a';
		
		for(int i=0;i<26;i++){
		
			str = (line++) + " : " + alf[i];
			System.out.println(str);
			
		}
		
		
		

	}

}