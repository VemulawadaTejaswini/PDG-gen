import java.util.Scanner;
public class MaximumProfit{
    static int dmin = -1000000000;
    static int dmax = 1000000000;
     
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i < n; i++){
            nums[i] = sc.nextInt();
        }
         
        int mp = dmin;
        for(int i=0; i < n; i++){
            for(int j=i+1; j < n; j++){
                if((j-1) != i && nums[j] <= nums[j-1]) continue;
            	int p = nums[j] - nums[i];
                if(p == dmax){
                	mp = p;
                	break;
                }
                if(mp < p) mp = p;
            }
        }
        System.out.println(mp);
    }
}