import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();
    	int P=sc.nextInt();

    	int cntEven=0;
    	int cntOdd=0;
    	for(int i=0;i<N;i++) {

    		int buf=sc.nextInt();

    		if(buf%2==0) {
    			cntOdd++;
    		}else {
    			cntEven++;
    		}


    	}

    	if(cntEven==0) {
    		if(P==0) {
    			System.out.printf("%.0f",Math.pow(2,N));
    		}else {
    			System.out.println("0");
    		}
    	}else {
    		System.out.printf("%.0f",Math.pow(2,N-1));
    	}

    }

}

