import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();        
        int k = scan.nextInt();
		int min = 0;
		min = n%k;	//nをkで割った余り

		if(min<(k-min)){   
			System.out.println(min);
		} else {
			System.out.println(k-min);		
		}
	    scan.close();	
    }
}