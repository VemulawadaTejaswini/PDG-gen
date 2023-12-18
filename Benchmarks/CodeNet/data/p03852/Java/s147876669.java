import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	String c=sc.next();

    	if(c.matches("[aiueo]")) {
    		System.out.println("vowel");
    	}else {
    		System.out.println("consonant");
    	}
    }
}
