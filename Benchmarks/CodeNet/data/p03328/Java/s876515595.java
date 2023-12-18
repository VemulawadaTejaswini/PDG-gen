import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    scan.close();
	    int sum=0;
	    for(int i=1;i<=999;i++) {
	    	sum+=i;
	    	if(i == (b-a) ) {
	    		System.out.println(sum-b);
	    		break;
	    	}
	    }

	}

}