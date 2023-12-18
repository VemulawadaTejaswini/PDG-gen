import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();

    	int[] T=new int[N];
    	for(int i=0;i<N;i++) {
    		T[i]=sc.nextInt();
    	}

    	int M=sc.nextInt();

    	int[][] P=new int[M][2];
    	for(int i=0;i<M;i++) {
    		P[i][0]=sc.nextInt()-1;
    		P[i][1]=sc.nextInt();
    	}

    	for(int t=0;t<M;t++) {
    		int sum=0;
	    	for(int i=0;i<N;i++) {

	    		if(P[t][0]!=i) {
	    			sum+=T[i];
	    		}else {
	    			sum+=P[t][1];
	    		}
	    	}

	    	System.out.println(sum);
    	}
    }
}

