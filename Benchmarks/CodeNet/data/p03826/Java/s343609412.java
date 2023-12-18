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
    	int C=sc.nextInt();
    	int D=sc.nextInt();
    	
    	int s1=A*B;
    	int s2=C*D;
    	
    	if(s1>=s2) {
    		System.out.println(s1);
    	}else {
    		System.out.println(s2);
    	}
    }
}
