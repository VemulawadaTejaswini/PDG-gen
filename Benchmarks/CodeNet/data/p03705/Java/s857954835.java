import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	long N=sc.nextInt();
    	long A=sc.nextInt();
    	long B=sc.nextInt();

    	if(A>B || (N==1 && A!=B)) {
    		System.out.println("0");
    		return;
    	}

    	long lowbound=(N-1)*A+B;
    	long upeerbound=A+(N-1)*B;

    	long result=upeerbound-lowbound+1;

    	System.out.println(result);
    }


}

