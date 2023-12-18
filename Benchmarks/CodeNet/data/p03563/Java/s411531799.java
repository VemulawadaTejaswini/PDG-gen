import java.util.*;
import static java.lang.System.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int ans = (G*2)-R;
		out.print(ans);
	}
}