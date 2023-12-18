import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n=sc,nextInt(),t=sc.nextInt(),a=sc.nextInt();
      int[] h = new int[n];
      double[] temp = new double[n];
      double min = 1000000;
      for(int i = 0;i < n;i++){
      	h[i] = sc.nextInt();
        temp[i] = t-h[i]*0.006;
        min = Math.min(min,Math.abs(temp[i]-a));
      }
      for(int i = 0;i < n;i++){
      	if(min == Math.abs(temp[i]-a)) System.out.println(i+1);
      }
    }
}