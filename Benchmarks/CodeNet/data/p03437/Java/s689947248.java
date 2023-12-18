import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);


    	int A=sc.nextInt();
    	int B=sc.nextInt();

    	if(A%B==0) {
    		System.out.println("-1");
    	}else {
    		System.out.println(A);
    	}

    }
}

