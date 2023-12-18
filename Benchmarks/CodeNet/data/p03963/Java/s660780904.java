import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	int K=sc.nextInt();

    	int result=K*(int)Math.pow(K-1,N-1);

    	System.out.println(result);


    }
}

