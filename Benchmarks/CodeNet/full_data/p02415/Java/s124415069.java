import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int i;
    	String str = "null";
    	char result[];
    	
    	while(true) {
    		str = sc.next();
        	result = new char[str.length()];
        	
        	for(i = 0; i < str.length(); i++) {
        		if(Character.isUpperCase(str.charAt(i))) {
        			result[i] = Character.toLowerCase(str.charAt(i));
        		} else {
        			result[i] = Character.toUpperCase(str.charAt(i));
        		}
        	}
        	for(i = 0; i < str.length(); i++) {
        		System.out.print(result[i]);
        	}
        	if(str.charAt(str.length()-1) == '.') {
        		System.out.println();
        		break;
        	}
        	else System.out.print(" ");
    	}
    }
}
