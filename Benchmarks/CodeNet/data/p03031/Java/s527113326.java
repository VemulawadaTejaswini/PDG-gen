
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int s = 1<<(sc.nextInt());
		int e = sc.nextInt();
		Condition[] cons = new Condition[e];
		
		for(int i=0;i<e;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++) {
				arr[j] = sc.nextInt();
			}
			cons[i] = new Condition(arr);
		}
		
		for(int i=0;i<e;i++) 
			cons[i].OE = sc.nextInt();
		
		sc.close();
		int j;
		int count = 0;
		for(int i=0;i<s;i++) {
			for(j=0;j<e;j++) {
				if(!cons[j].meets(i))
					break;
			}
			if(j==e)
				count++;
		}
		System.out.println(count);
	}
}

class Condition{
	int[] nums;
	int OE;
	
	Condition(int[] nums){
		this.nums = nums;
	}
	
	
	boolean meets(int state) {
		int sum = 0;
		for(int i=0;i<nums.length;i++)
			sum += (state >> (nums[i]-1))&1;
		return OE == (sum&1);
	}
}