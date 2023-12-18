import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int l = scn.nextInt();
		int[] a = new int[n+1];
      	a[0] = 0;
		for(int i=1; i<=n; i++){
			a[i] = l + i -1;
		}
      	int sum = 0;
      	for(int i=1; i<=n; i++){
          sum += a[i];
        }
      	int low = Math.abs(a[1]);
      	int num = 0;
      	for(int i=1; i<=n; i++){
          num = Math.abs(a[i]);
          if(low>num) low = num;
        }
      	System.out.println(sum-low);
	}
}
