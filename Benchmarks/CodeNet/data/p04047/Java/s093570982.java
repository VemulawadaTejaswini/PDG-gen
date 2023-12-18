import java.util.Arrays;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();

    	int[] L=new int[2*N];

    	for(int i=0;i<L.length;i++) {
    		L[i]=sc.nextInt();
    	}

    	Arrays.sort(L);

    	int sum=0;
    	for(int i=0;i<L.length;i++) {
    		if(i%2==0) {
    			sum+=L[i];
    		}
    	}

    	System.out.println(sum);
    }


}

