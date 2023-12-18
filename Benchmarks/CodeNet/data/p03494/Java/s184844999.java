import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);

    	int n =scanner.nextInt();

    	int[] data=new int[n];

    	boolean hasOdd=false;

    	for (int i = 0; i < data.length; i++) {

    		int buf=scanner.nextInt();

    		if(buf%2!=0) {
    			hasOdd=true;
    			break;
    		}

    		data[i]=buf;
		}

    	if(!hasOdd) {
    		Arrays.sort(data);
    		int target=data[0];

    		System.out.println(gethowmanydividetwo(target));

    	}else {
    		System.out.println("0");
    	}

    	scanner.close();


    }

    public static int gethowmanydividetwo(int n) {

    	int counter=0;

    	while(true) {

    		if(n%2!=0) {
    			return counter;
    		}

    		n=n/2;
    		counter++;


    	}

    }
}