import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];
        int count = 0;

        for(int i = 0 ; i < N; i++) {
        	list[i] = sc.nextInt();

        }

        for(int j = 0; j < N - 1; j++) {
        	for(int k = 0; k < N; k++) {
        		int num1 = k - j;
        		int num2 = list[k] + list[j];
        		if(num2 < 0) {
        			num2 = -num2;
        		}
        		if(num1 == num2) {
        			count++;
        		}
        	}
        }

        System.out.println(count);
    }
}