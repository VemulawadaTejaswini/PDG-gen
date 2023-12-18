
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);

	    String a = scan.next();
	    String b = scan.next();
	    String[] c = a.split("");
	    String[] d = b.split("");
	    
	    for(int i=0;i<c.length-1;i++){
	    System.out.print(c[i]);
	    	System.out.print(d[i]);
	    }
	    if(c[c.length-1].isEmpty())
	    	System.out.println();
	    else 
	    	System.out.println(c[c.length]);

	}
}
