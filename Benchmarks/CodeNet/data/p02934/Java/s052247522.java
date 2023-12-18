import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> inputNumList = new ArrayList<Integer>();
    	Scanner scan = new Scanner(System.in);

    	float sum = 0;
    	int count = scan.nextInt();

    	for(int i=0; i<count; i++) {

        	inputNumList.add(scan.nextInt());
        	sum = sum + (float)(1.0/inputNumList.get(i));

    	}

    	scan.close();
     	System.out.println(1.0/sum);

	}

}