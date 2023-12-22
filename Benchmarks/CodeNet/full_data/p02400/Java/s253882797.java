import java.util.Scanner;


/**
 * @author kawakami
 *
 */
/**
 * @author kawakami
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
	       
        float r;
		float t;
		float s;
		double pi=Math.PI;

       
           
        r = as.nextFloat();
        System.out.println(r);
           
           
        s=(float) (pi*r*r);
        t=(float) (2.0*pi*r);

        System.out.println(s+" "+t);

	}

}