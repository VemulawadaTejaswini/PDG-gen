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

    	int K=sc.nextInt();

    	for(int i=A;i<=Math.min(A+K-1, B);i++) {
    		System.out.println(i);
    	}

    	for(int i=(Math.max(A,B-K+1));i<=B;i++) {
    		System.out.println(i);
    	}



    }



}

