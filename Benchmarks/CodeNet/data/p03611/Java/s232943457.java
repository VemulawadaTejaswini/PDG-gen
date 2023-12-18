import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] x = new int[100001];
      for(int i = 0;i < n;i++){
      	int a = sc.nextInt();
        if(a==0){
        	x[0]++;
            x[1]++;
        }else if(a==100000){
        	x[99999]++;
            x[100000]++;
        }else{
        	x[a-1]++;
        	x[a]++;
        	x[a+1]++;
        }
      }
      int max = 0;
      for(int i = 0;i < 100000)max = Math.max(max,x[i]);
      System.out.println(max);
    }
}