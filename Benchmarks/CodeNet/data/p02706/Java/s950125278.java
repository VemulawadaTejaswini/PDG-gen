import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int days = 0;
        
        for(int i=0; i<m; i++){
        	days += scan.nextInt();
        } 
           
        if (n>=days) {
			System.out.println(n-days);
		} else {
			System.out.println(-1);
		}
	    scan.close();	
    }
}