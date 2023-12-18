

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	long[] num = new long[n + 1];
    	num[0] = 2l;
    	num[1] = 1l;
    	for (int i = 2; i <= n; i++) {
    		num[i] = num[i-1] + num[i - 2];
    	}
     	System.out.println(num[n]);
    }
}

