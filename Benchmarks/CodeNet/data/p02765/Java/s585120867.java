/**
 *
 */
package hello_world;

import java.util.Scanner;

/**
 * @author hellb
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int inum1 = scan.nextInt();
        int inum2 = scan.nextInt();
        int iResult;


        if (inum1 >= 10) {
        	iResult = inum2;
        } else {
        	iResult = 100 * (10 -inum1);
        	iResult = iResult + inum2;
        }

        System.out.print(iResult);
	}
}
