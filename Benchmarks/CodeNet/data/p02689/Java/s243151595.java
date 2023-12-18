import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int m = scn.nextInt();
		int[] h = new int[n+1];
		for(int i=0; i<n; i++){
			h[i] = scn.nextInt();
		}
      	int[] a = new int[m];
      	int[] b = new int[m];
      	for(int i=0; i<m; i++){
			a[i] = scn.nextInt();
          	b[i] = scn.nextInt();
		}
      	int[] max = new int[n+1];
      	for(int i=0; i<m; i++){
          max[a[i]] = Math.max(max[a[i]], h[b[i]]);
          max[b[i]] = Math.max(max[b[i]], h[a[i]]);
        }
      	int count = 0;
      	for(int i=0; i<max.length; i++){
          if(h[i]>max[i]) count++;
        }
      	System.out.println(count);
	}
}
