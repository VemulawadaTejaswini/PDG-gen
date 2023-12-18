import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);
    	
    	int x=sc.nextInt();
    	int A=sc.nextInt();
    	int B=sc.nextInt();
    	
    	int d1=Math.abs(A-x);
    	int d2=Math.abs(B-x);
    	
    	if(d1<d2) {
    		System.out.println("A");
    	}else {
    		System.out.println("B");
    	}
    }
}
