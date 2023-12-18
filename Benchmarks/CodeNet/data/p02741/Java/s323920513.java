
package k.element;

/**
 *
 * @author Dell
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class KElement {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int arr[]=new int[]{1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
        int k=input.nextInt();
        System.out.println(arr[k%32-1]);
        
    }

}
