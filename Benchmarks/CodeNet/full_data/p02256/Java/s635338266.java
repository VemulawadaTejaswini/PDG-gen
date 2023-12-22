import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
    	Scanner sc = new Scanner(System.in);

    	int x = sc.nextInt();
    	int y = sc.nextInt();

    	if(y>x) {
    		int tmp = x;
    		x = y;
    		y = tmp;
    	}

    	int z = x%y;

    	int a = z;

    	while(true) {
    		if(y%a==0 && z%a==0) {
    			break;
    		}
    		a--;
    	}

    	System.out.println(a);

    	sc.close();
    }
}
