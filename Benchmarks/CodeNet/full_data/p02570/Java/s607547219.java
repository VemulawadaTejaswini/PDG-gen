import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int dist = in.nextInt();
		int time = in.nextInt();
		int speed = in.nextInt();
      	int need = dist / speed;
      	if (dist%speed != 0) need += 1;
      
      	if (time >= need) {
          	System.out.println("Yes");
        } else {
          	System.out.println("No");
        }
    }
}
