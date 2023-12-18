import java.util.Scanner;

public class Maine {
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        int i = Integer.parseInt(str);
        
        if (1 <= i && i <= 1000000) {
        	if (i % 2 == 0) {
        		i = i / 2 - 1;
        	} else {
        		i = (i - 1) / 2;
        	}
        	System.out.println(i);
        }
        return;
	}
}
