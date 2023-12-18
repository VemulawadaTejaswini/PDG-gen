import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	int A=sc.nextInt();
    	int B=sc.nextInt();
    	
    	int result=Math.min(N*A,B);
    	
    	System.out.println(result);

    }
}

