import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	
    	int sum=a+b;
    	int ave=(sum+2-1)/2;
    	
    	System.out.println(ave);
    	
    }

}





