import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split(" ");
		String[] b = sc.nextLine().split(" ");
		String c = sc.nextLine();
      
      	if (c == a[0]) {
          System.out.println(Integer.toString(Integer.parseInt(b[0]) - 1) + " " + b[1]);

        } else if (c == a[1]) {
          System.out.println(b[0] + " " + Integer.toString(Integer.parseInt(b[1]) - 1));

        }
 
	}
}