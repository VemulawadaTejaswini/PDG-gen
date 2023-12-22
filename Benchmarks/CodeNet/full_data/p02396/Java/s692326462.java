import java.util.ArrayList;

public class Main {

	public static void main (String[] args) {
		
		long i = 0;
	    ArrayList<Integer> an = new ArrayList<Integer>();
	    while (true)
	    {
	        int x = new java.util.Scanner (System.in).nextInt();
	         
	        if (x ==0)
	            break;
	        an.add(x);
	        i++;
	    }
	    for (int j = 1; j < i + 1; j++)
	    {
	        int b = an.get(j - 1);
	        System.out.println("Case " + j + ": " + b);
	    }
		
		
	}
}