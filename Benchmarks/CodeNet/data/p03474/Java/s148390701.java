import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
	    int B = sc.nextInt();

	    String str = sc.next();
	    char[] c = str.toCharArray();
	    for(int i=0; i<A+B+1; i++){
	    	if(i==A){
	    		if(!(String.valueOf(c[i]).equals("-"))){
	    			System.out.println("No");
	    			return;
	    		}
	    	}else{
	    		if(Character.isDigit(c[i])==false){
	    			System.out.println("No");
	    			return;
	    		}
	    	}
	    }

	    System.out.println("Yes");
    }
}