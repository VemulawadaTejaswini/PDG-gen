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

    	int sum=0;
    	for(int i=0;i<3;i++) {

    		data[i]=sc.nextInt();
    		sum+=data[i];
    	}

    	Arrays.sort(data);


    	if(sum-data[2]==sum/2) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}

    }
}
