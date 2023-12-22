import java.util.Scanner;

public class Main {
    public static void main (String args[]){
    	Scanner str = new Scanner(System.in);
    	int a = str.nextInt();
    	int b = str.nextInt();
    	int c = str.nextInt();
    if(c < b){
    	    if(c <a){
    	    	System.out.println("c a b");
    	    }else{
    	    	System.out.println("a c b");
    	    }
    	}else{
    		if(a < b){
    	    	System.out.println("a b c");
    	    }else{
    	    	System.out.println("b a c");
    	    }
    	}
    }

}