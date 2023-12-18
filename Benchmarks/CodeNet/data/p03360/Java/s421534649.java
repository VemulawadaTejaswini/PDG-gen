import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int[] data=new int[3];

    	for(int i=0;i<3;i++) {
    		data[i]=sc.nextInt();
    	}

    	int K=sc.nextInt();
    	Arrays.sort(data);

    	for(int i=0;i<K;i++) {
    		data[2]*=2;
    	}

    	int sum=0;

    	for(int i=0;i<3;i++) {
    		sum+=data[i];
    	}

    	System.out.println(sum);



    }

}





