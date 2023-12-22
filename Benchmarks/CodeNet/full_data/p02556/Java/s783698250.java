import java.util.*;
    public class Main{
    	public static void main(String[] args){
        	Scanner s  = new Scanner(System.in);
          	int n = s.nextInt();
          	int max = 0;
          	int[] Xs = new int[n];
          	int[] Ys = new int[n];
          	int[] sums = new int[n];
          	int[] diffs = new int[n];
          	for(int i = 0;i<n;i++){
            	Xs[i] = s.nextInt();
              	Ys[i] = s.nextInt();
              	sums[i] = Xs[i]+Ys[i];
              	diffs[i] = Xs[i]-Ys[i];
            }
          Arrays.sort(sums);
          Arrays.sort(diffs);
          int res1 = sums[n-1]-sums[0];
          int res2 = diffs[n-1] - diffs[0];
          System.out.println(Math.max(res1,res2));
        }
    }