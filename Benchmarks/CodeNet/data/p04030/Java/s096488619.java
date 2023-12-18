import java.util.ArrayDeque;
import java.util.Deque;
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

    	Deque<String> result=new ArrayDeque<String>();

    	for(int i=0;i<input.length;i++) {

    		if(!input[i].equals("B")) {
    			result.push(input[i]);
    		}else {

    			if(!result.isEmpty()) {
    				result.pop();
    			}
    		}
    	}

    	int Size=result.size();
    	String buf="";
    	for(int i=0;i<Size;i++) {

    		if(!result.isEmpty()) {
    			buf=result.pollLast();
    		}

    		System.out.print(buf);
    	}

    	System.out.println();
    }
}

