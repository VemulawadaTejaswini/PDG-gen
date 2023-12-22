import java.util.*;

public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
    	new AOJ().doIt();
    }
    
    class AOJ{
    	void doIt(){
    		while(in.hasNext()){
    			int a = in.nextInt();
        		int b = in.nextInt();
        		System.out.println(Integer.toString(a+b).length());
    		}
    	}
    }
    
}