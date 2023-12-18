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

    	int p=a*b;

    	if(p%2==0) {
    		System.out.println("Even");
    	}else {
    		System.out.println("Odd");
    	}


    }

}





