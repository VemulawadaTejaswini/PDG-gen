import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();

    	int cntE=0;
    	int cntO=0;

    	for(int i=0;i<N;i++) {

    		int A=sc.nextInt();

    		if(A%2==0) {
    			cntE++;
    		}else {
    			cntO++;
    		}

    	}

    	int result=(int)Math.pow(3,N)-(int)Math.pow(2,cntE);

    	System.out.println(result);

    }

}

