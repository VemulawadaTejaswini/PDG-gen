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
    		for(int i=1;i<=9;i++)for(int s=1;s<=9;s++)System.out.println(i+"x"+s+"="+(i*s));
    	}
    }
    
}