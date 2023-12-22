import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	String word = scn.next();
	int count = 0;

	for(String token = scn.next(); !(token.equals("END_OF_TEXT")); token = scn.next())
	    if(word.equals(token)){
	    	count++;
	    }  

	System.out.println(count);
    }
}