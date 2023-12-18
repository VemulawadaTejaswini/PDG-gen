import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	String A=sc.next();
    	String B=sc.next();

    	int lengthA=A.length();
    	int lengthB=B.length();
    	
    	String result="";

    	if(lengthA>lengthB) {
    		result="GREATER";
    	}else if(lengthA<lengthB) {
    		result="LESS";
    	}else {
    		
    		if(A.compareTo(B)>0) {
    			result="GREATER";
    		}else if(A.compareTo(B)<0) {
    			result="LESS";
    		}else {
    			result="EQUAL";
    		}
    		
    	}

    	System.out.println(result);
    }

}

