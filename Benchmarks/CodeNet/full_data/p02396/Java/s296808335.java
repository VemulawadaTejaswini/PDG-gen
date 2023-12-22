import java.util.Scanner;

public class Main {
	static StringBuffer buf = new StringBuffer();
    public static void main (String args[]){
    	int count=1;

    	while(true){

        Scanner sc = new Scanner(System.in);
    	    int a = sc.nextInt();
    	    if(10000<a){
    	    	System.out.println("Too Large");
    	    	break;
    	    }
    	    if(1<=a&&a<=10000){
                  String i = Integer.toString(count);
                  System.out.println("Case "+ i +": "+Integer.toString(a) );
                  count++;
    	    }
    	    if(a==0){
    	    	break;
    	    }

    	}
    }
}