import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String word = scan.next();
      	if(word.equals("G")){
        	System.out.println("C");
        } else if(word.equals("C")){
        	System.out.println("G");
        } else if(word.equals("T")){
        	System.out.println("A");
        } else {
        	System.out.println("T");
        }
    }
}