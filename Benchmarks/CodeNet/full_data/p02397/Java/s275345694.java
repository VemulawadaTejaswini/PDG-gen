
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        for(;;) {
        	int x=in.nextInt();
        	int y=in.nextInt();
        	if(x==y&&x==0) break;
        	if(x>y) {
        		int k=y;
        		y=x;
        		x=k;
        	}
        	System.out.println(x+" "+y);
        }
    }
}
