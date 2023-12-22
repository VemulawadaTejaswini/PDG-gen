import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int x, y;
        while (true)
        {
        	String[] list = new java.util.Scanner( System.in).nextLine().split(" ");
        	x = Integer.parseInt(list[0]);
        	y = Integer.parseInt(list[1]);
        	if (x == 0 && y == 0)
        		break;
        	if (x <= y)
        		System.out.println(x + " " + y);
        	else if ( x > y)
        		System.out.println(y + " " + x);
        }
	}

}