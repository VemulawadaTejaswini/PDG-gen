import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	String X=sc.next();
    	String Y=sc.next();

    	if(X.compareTo(Y)<0) {
    		System.out.println("<");
    	}else if(X.compareTo(Y)>0) {
    		System.out.println(">");
    	}else {
    		System.out.println("=");
    	}
    	

    }
}

