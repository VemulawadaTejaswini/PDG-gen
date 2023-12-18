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

    	int diff=b-a-1;

    	int highta=diff*(diff+1)/2;

    	int x=highta-a;

    	System.out.println(x);
    }
}

