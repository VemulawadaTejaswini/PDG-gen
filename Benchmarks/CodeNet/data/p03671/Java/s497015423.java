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
    	
    	Arrays.sort(data);
    	
    	int result=data[0]+data[1];
    	
    	System.out.println(result);
    	
    	
    	
    }
}
