import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int d = 0;

		HashSet<Integer> hs = new HashSet<>();
		for (int i=1; i<n+1; i++) {
			hs.add(i);
	    }

		for (int j=0; j<k; j++) {		
			d = scan.nextInt();
			for (int i=0; i<d; i++) {
				hs.remove(scan.nextInt());
	    	}
	    }
        
		System.out.println(hs.size());
	    scan.close();	
    }
}