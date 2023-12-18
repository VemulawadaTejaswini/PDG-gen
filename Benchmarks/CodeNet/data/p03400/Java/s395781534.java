import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	int D=sc.nextInt();
    	int X=sc.nextInt();

    	int[] A=new int[N];

    	for(int i=0;i<N;i++) {
    		A[i]=sc.nextInt();
    	}

    	int counter=0;
    	for(int i=0;i<N;i++) {
    		int now=A[i];

    		for(int j=0;j*now+1<=D;j++) {
    			counter++;
    		}
    	}

    	System.out.println(counter+X);

    }



}

