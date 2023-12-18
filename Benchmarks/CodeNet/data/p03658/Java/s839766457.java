import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int[] sticks = new int[n];
      	for (int i = 0; i < sticks.length; i++) {
        	sticks[i] = sc.nextInt();
        }
      	Arrays.sort(sticks);
      	int res = 0;
      	int pos = sticks.length - 1;
      	
      	while (k >= 0) {
        	res += sticks[pos];
          	k--;
          	pos--;
        }
      	System.out.println(res);
    }
}