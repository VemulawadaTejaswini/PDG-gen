import java.util.List;
import java.util.Scanner;



public class Main {


	static List<Integer> ansset;

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	String S=sc.next();

    	String[] input=S.split("");

    	String[] result=new String[10];

    	int pointer=0;

    	for(int i=0;i<input.length;i++) {

    		String buf=input[i];

    		if(!buf.equals("B")) {

    			result[pointer++]=buf;
    		}else {

    			pointer--;

    			if(pointer<0) {
    				pointer=0;
    			}
    		}

    	}

    	for(int i=0;i<10;i++) {
    		if(result[i]!=null) {
    			System.out.print(result[i]);
    		}
    	}

    	System.out.println();
    }
}

