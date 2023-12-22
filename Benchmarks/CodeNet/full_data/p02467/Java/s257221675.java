import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
     public static void main(String[] args){
     	long MAX = 10*10*10*10*10*10*10*10*10;
     	
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            long n = Long.parseLong(br.readLine());
            
        	System.out.print(n + ":");
     		for (int i = 2; i <= MAX; i++) {
	     		if (n == 1) {
	     			break;
	     		}
	     		if (n%i == 0) {
	     			System.out.print(" " + i);
	     			n = n/i;
	     			i = 1;
	     		}
	     	}
        	System.out.println();
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}