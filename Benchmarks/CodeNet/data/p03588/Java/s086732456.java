import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();

    	long[][] data=new long[N][2];

    	for(int i=0;i<N;i++) {
    		data[i][0]=sc.nextLong();
    		data[i][1]=sc.nextLong();
    	}

    	int max=-1;
    	int indexMAX=-1;
    	Long min=data[0][1];
    	int indexMIN=0;

    	for(int i=0;i<N;i++) {

    		Long buf=data[i][1];


    		if(min>buf) {
    			min=buf;
    			indexMIN=i;
    		}
    	}

    	Long result=data[indexMIN][0]+min;

    	System.out.println(result);

    }

}

