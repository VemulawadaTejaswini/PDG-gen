import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int a,b,k;
    	
    	a = in.nextInt();
    	b = in.nextInt();
    	k = in.nextInt();
    	
    	
    	if (a < b) {
    		int tmp = b;
    		b = a;
    		a = tmp;
    	}
    	
    	int counter = 0;
    	int ans = 0;
    	
    	for (int i = a; i > 0; i--) {
    		if ((b-a) % i == 0) {
    			counter++;
    			if (counter == k) {
    				System.out.println(i);
    				return;
    			}
    		}
    	}
    	
    }

  }
