import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();
    	int M=sc.nextInt();
    	int K=sc.nextInt();

    	int num=0;
    	for(int k=0;k<=N;k++) {
    		for(int l=0;l<=M;l++) {

    			num=K*(M-l)+l*(N-K);

    			if(num==K) {
    				System.out.println("Yes");
    				return;
    			}

    		}
    	}

    	System.out.println("No");

    }

}

