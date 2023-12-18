import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int x = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      	int sum = 0;
      	for(int i=0; i<a.length; ++i){
			sum = sum + a[i];
		}
      	int xx = x - sum;
      	int mini = 1000;
      	for(int i=0; i<a.length; ++i){
			if(mini>a[i]){
              mini = a[i];
            }
		}
      	int num = xx/mini;
      	int ans = n + num;
      	System.out.println(ans);
	}
}