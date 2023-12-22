import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int a, l, keta;
    int[] nums;
    HashMap<Integer, Integer> as;

    void run(){
	while(sc.hasNext()){
	    a = sc.nextInt();
	    l = sc.nextInt();
	    if(a==0 && l==0) break;


	    as = new HashMap<Integer, Integer>();
	    as.put(a, 0);
	    int count = 1;
	    int tmp = a;

	    while(true){

		nums = new int[l];
		keta = 10;
		for(int i=0; i<l; i++){
		    nums[i] = tmp%keta;
		    tmp /= 10;
		    //System.out.print(nums[i]+" ");
		}
		//System.out.println();

		Arrays.sort(nums);
		int x = 0, y = 0;
		keta = 1;
		for(int i=0; i<nums.length; i++){
		    x += nums[i]*keta;
		    y += nums[l-1-i]*keta;
		    keta *= 10;
		    //System.out.println(x+" "+y);
		}	

		int an = Math.abs(x-y);
		//System.out.println(an);	
		if(as.containsKey(an)){
		    System.out.println(as.get(an)+" "+an+" "+(count-as.get(an)));
		    break;
		}
		
		as.put(an, count);
		tmp = an;
		count++;
	    }
	}
    }
}