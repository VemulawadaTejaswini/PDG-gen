import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, a, b, ans;
    int[] nums;
    int max = Integer.MAX_VALUE;
    
    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    a = sc.nextInt();
	    b = sc.nextInt();
	    ans = 0;
	    if(n==0) break;

	    nums = new int[n+1];
	    Arrays.fill(nums, max);
	    nums[0] = 0;

	    // aとbそれぞれ回す
	    for(int i=0; i<nums.length; i++)
		if(nums[i]!=max && i+a<nums.length)
		    nums[i+a] = nums[i]+a;
	    for(int i=0; i<nums.length; i++)
		if(nums[i]!=max && i+b<nums.length)
		    nums[i+b] = nums[i]+b;

	    // maxの箇所を数える
	    for(int i=0; i<nums.length; i++)
		if(nums[i]==max) ans++;

	    System.out.println(ans);
	}
    }
}