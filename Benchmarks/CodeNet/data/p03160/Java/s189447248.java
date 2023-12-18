import java.util.Arrays;
public class Main
{
    public static int frog(int[] arr, int i, int[] dp){
        if(i >= arr.length){
            return 0;
        }
        int ans = 0;
        if(i == arr.length-1){
            //System.out.println(Arrays.toString(dp));
            return ans;
        }
        int op1 = 0;
        int op2 = 0;
        if(i+1 < arr.length){
            op1 = Math.abs(arr[i] - arr[i+1]) + frog(arr, i+1, dp);
        }
        if(i+2 < arr.length){
            op2 = Math.abs(arr[i] - arr[i+2]) + frog(arr, i+2, dp);
        }
        ans = Math.min(op1, op2);
        return ans;
    }
	public static void main(String[] args) {
	    //int[] arr = {10, 30, 40, 20};
	int[] arr = {30, 10, 60, 10, 60, 50, 10};
	int[] dp = new int[arr.length];
	//Arrays.fill(dp, Integer.MAX_VALUE);
	System.out.println(frog(arr, 0, dp));
	}
}
