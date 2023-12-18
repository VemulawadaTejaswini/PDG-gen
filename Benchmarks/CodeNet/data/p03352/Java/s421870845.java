import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int xx = x / 2;
    	int ans = 0;

    	for(int i = 0; i < xx; i++){
    		for(int j = 0; j < xx; j++){
    			if(Math.pow(i, j) > ans && Math.pow(i, j) <= x) ans = (int)Math.pow(i, j);
    		}
    	}

    	System.out.println(ans);
    }
}