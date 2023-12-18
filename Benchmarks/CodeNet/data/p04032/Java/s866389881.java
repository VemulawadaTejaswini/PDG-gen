import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		String input = sc.next();
		int start = 0;
		int end = 0;
		boolean flag_find = false;
				
		startloop:
		for (int i = 0; i < input.length(); i++) {			
			for (int j = 0; j < end; j++) {
				if(check_unbalanced(input.substring(j, end + 1))) {
					start = j;
					flag_find = true;
					break startloop;
				}
				
			}						
			end = i + 1;
		}		
		
						
		if(flag_find) {
			start++;
			end++;
			System.out.println(start + " " + end);			
		} else {
			System.out.println("-1 -1");
		}		
	}
	
	
	public static boolean check_unbalanced(String inputStr) {
    	int[] alphabet = new int[26];
    	
	    for (int i = 0; i < 26; i++) alphabet[i] = 0;
	    
    	for(int i = 0; i < inputStr.length(); i++) {
    		char aux = inputStr.charAt(i);
    		int char_number = (int)aux;
    		//lowercase letters corresponding numbers goes between 97 and 122
    		alphabet[char_number - 97]++;
    	}
    	
    	int size_input = inputStr.length();
    	int mark = 0;
    	
    	if((size_input % 2) == 0) {
    		mark = size_input / 2;
    	} else {
    		mark = (size_input - 1)/2;
    	}
    	
    	for (int i = 0; i < 26; i++) {
    		if(alphabet[i] > mark) {
    			return true;
    		}
    	}
    	
    	return false;
    }
}