import java.util.Arrays;
import java.util.Scanner;

public class ITP1_2_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int[] nums = new int[] {a, b, c};

        Arrays.sort(nums);


        	System.out.printf("%d %d %d\n",nums[0], nums[1], nums[2]);


	}

}

