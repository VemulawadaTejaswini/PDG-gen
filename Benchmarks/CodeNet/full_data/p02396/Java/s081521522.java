import java.util.Scanner;

public class Main {
	static StringBuffer buf = new StringBuffer();
    public static void main (String args[]){
    	int count=1;
    	int num =1;
    	while(true){
    		if(10000<num){
    			
    			break;
    		}
    		num++;
    	}

    	while(true){

        Scanner sc = new Scanner(System.in);
    	    int a = sc.nextInt();
    	    if(1<=a&&a<=10000){
                  String i = Integer.toString(count);
                  System.out.println("Case "+ i +": "+Integer.toString(a) );

    	    }
    	    if(a==0){
    	    	break;
    	    }
            count++;
    	}
    }
}