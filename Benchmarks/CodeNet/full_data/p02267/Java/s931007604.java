import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] a = new int[x];
        for(int i=0; i<x; i++) {
        	a[i] = sc.nextInt();
        }

        int y = sc.nextInt();
        int[] b = new int[y];
        for(int i=0; i<y; i++) {
        	b[i] = sc.nextInt();
        }

        int[] c = new int[x+1];
        for(int i=0; i<x; i++) {
        	c[i] = a[i];
        }

        int sum = 0;
        for(int i=0; i<y; i++) {
        	c[x] = b[i];
        	if(serch(c, x, b[i])) {
        		sum++;
        	}
        }

        System.out.println(sum);

        sc.close();
    }

    public static boolean serch(int[] c, int x, int b) {
    	int i = 0;
    	while(c[i]!=b) {
    		i++;
    	}
    	return i!=x;
    }
}
