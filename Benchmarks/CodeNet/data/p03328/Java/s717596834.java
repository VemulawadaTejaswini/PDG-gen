import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int[] h = new int[1000];

        for(int i = 1; i < 1000; ++i){
        	sum += i;
        	h[i] = sum;
//        	System.out.println(sum);
        }

        int ans = 0;
        for(int i = 1; i < 1000; ++i ){
        	if(a < h[i]){
        		ans = h[i] - a;

	        	int wk = b + ans;
	        	for(int j = i; j < 1000; ++j ){
	        		if (h[j] == wk){
	        	        System.out.println(ans);
	        	        return;
	        		}
	        	}
        	}
        }

        System.out.println(1);

	}
}