import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	for(int i=0;i<3;i++) {

    		String buf=sc.next();

    		System.out.print(buf.substring(i,i+1));

    	}

    	System.out.println();

    }

}





