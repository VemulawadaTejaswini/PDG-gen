import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] b = a.toCharArray();
		char []alphabet = new char[26];
	    char c = 'a';
	    for (int i = 0; i < 26; i++){
	        alphabet[i] = c++;
	    }
	    
	    for (int i = 0; i < 26; i++){
	        if(b[0] == alphabet[i]) {
	        	System.out.println(alphabet[i+1]);
	        }
	    }


 
		sc.close();
	}
}