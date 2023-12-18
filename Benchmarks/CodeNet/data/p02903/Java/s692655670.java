import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = 0;
        for(int i = 0; i < h; i++) {
        	for(int j = 0; j < w; j++) {
        		if(i < b && j < a || i >= b && j >= a)
        			res = 1;
        		else res = 0;
        		if(j == w - 1)
        			System.out.println(res);
        		else
        			System.out.print(res);
        	}
        }
    }
}
