import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    sc.close();
	    
	    int c_0=0;
	    int c_1=0;
        for(int i = 0; i < S.length(); i++){
        	if (S.charAt(i)=='0')
        		c_0++;
        	else 
        		c_1++;
        }
        System.out.println(2*Math.min(c_0, c_1));
      
       

	}

}
