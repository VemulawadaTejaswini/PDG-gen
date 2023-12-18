import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();

    	int a=N/15;

    	int result=N*800-a*200;

    	System.out.println(result);

    }
}
