/**
 *
 */
/**
 * @author SS1007
 *
 */
package branchonCondition;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


class Main
{

	public static void main (String[] args) throws java.lang.Exception
	 {
		InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a < b) {
        	System.out.println("a < b");
        }else {
        	System.out.println("a > b");
        }
        scan.close();






	 }
}
