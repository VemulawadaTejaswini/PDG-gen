import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);
    	
    	int N=sc.nextInt();
    	
    	int a=N/100;
    	int b=N%10;
    	
    	if(a==b) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    }
}
