import java.io.*;
    public class Main
    {
        public static int frog(int[] arr, int i){
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
                op1 = Math.abs(arr[i] - arr[i+1]) + frog(arr, i+1);
            }
            if(i+2 < arr.length){
                op2 = Math.abs(arr[i] - arr[i+2]) + frog(arr, i+2);
            }
            ans = Math.min(op1, op2);
            return ans;
        }
    	public static void main(String[] args) throws Exception {
    	    //int[] arr = {10, 30, 40, 20};
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    int n = Integer.parseInt(br.readLine());
    	    String[] s = br.readLine().split(" ");
    	    int[] arr = new int[s.length];
    	    for(int i = 0; i < arr.length; i++){
    	        arr[i] = Integer.parseInt(s[i]);
    	    }
    // 	int[] arr = {30, 10, 60, 10, 60, 50, 10};
    // 	int[] dp = new int[arr.length];
    	//Arrays.fill(dp, Integer.MAX_VALUE);
    	System.out.println(frog(arr, 0));
    	}
    }
