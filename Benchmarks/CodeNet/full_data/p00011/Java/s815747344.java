import java.util.Scanner;
import java.util.regex.*;

class Main {

    public static void main(String[] args){

	Scanner stdin = new Scanner(System.in).useDelimiter("[ \t,\n]");
	int n = stdin.nextInt();
	int line = stdin.nextInt();

	int[] nums = new int[n + 1];
	for(int i = 1; i <= n; i++){
	    nums[i] = i;
	}
	stdin.nextLine();
	for(int i = 0; i < line; i++){
	    int sw1 = stdin.nextInt();
	    int sw2 = stdin.nextInt();
	    int temp = nums[sw1];
	    nums[sw1] = nums[sw2];
	    nums[sw2] = temp;
	}
	for(int i = 1; i <= n; i++){
	    System.out.println(nums[i]);
	}
    }
}
	
	