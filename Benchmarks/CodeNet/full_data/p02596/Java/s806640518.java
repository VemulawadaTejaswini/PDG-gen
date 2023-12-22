import java.util.*;

class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextInt();
        long sev = 7;
        int counter = 1;
        
        while (sev % K != 0) {
            if (counter == K) {
                counter = -1;
                break;
            }
            sev = 10*sev + 7;
            counter++;
        }
		  
      	System.out.println(counter);
	}	
}