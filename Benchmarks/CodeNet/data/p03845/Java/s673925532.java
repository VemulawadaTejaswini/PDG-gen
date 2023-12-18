import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] t = new int[n];
		for(int i=0; i<n; i++){
			a[i] = scn.nextInt();
		}
      	int sum = 0;
      	for(int i=0; i<n; i++){
          sum += a[i];
        }
      	int m = scn.nextInt();
		int[] p = new int[m];
      	int[] x = new int[m];
		for(int i=0; i<m; i++){
			p[i] = scn.nextInt();
          	x[i] = scn.nextInt();
		}
      	int dif = 0;
      	for(int i=0; i<m; i++){
          dif = a[p[i]]-x[i];
          System.out.println(sum-dif);
        }
	}
}