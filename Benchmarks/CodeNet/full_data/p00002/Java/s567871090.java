import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner scn = new Scanner(System.in);
    	int a,b;
    	
    	for(;;){
    		a = scn.nextInt();
    		b = scn.nextInt();
    		
    		int i = a + b;
    		int count = 1;
    		
    		for(; i>=10;i/=10,count++);
    		
    		System.out.println(count);
    		
    	}
    }
}