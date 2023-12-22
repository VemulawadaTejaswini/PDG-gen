import java.util.Scanner;

class Main {

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int[] nums = new int[6];
	final int a = 0;
	final int b = 1;
	final int c = 2;
	final int d = 3;
	final int e = 4;
	final int f = 5;
	
	
	while(stdin.hasNextInt()){
	    for(int i = 0; i < 6; i++){
		nums[i] = stdin.nextInt();
	    }

	    double y = (nums[d] * nums[c] - nums[a] * nums[f]) /
		(nums[d] * nums[b] - nums[a] * nums[e]);
	    double x = (nums[c] - nums[b] * y) / nums[a];
	    System.out.printf("%.3f %.3f\n", x, y);
	}
    }
}