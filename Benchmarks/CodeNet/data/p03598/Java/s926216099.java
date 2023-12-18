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

    	int sum=0;

    	for(int i=0;i<N;i++) {
    		int buf=sc.nextInt();

    		sum+=getMinDistance(K, buf);

    	}

    	System.out.println(sum);

    }

    public static int getMinDistance(int K,int buf) {

    	int distanceA=2*buf;
    	int distatnceB=2*(K-buf);

    	return distanceA<=distatnceB?distanceA:distatnceB;


    }


}

