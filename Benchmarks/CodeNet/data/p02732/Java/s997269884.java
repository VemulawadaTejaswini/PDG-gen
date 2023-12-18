import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = scn.nextInt();
		}
      	int[] b = new int[n+1];
      	for(int i=0; i<n; i++){
          b[a[i]] ++;
        }
      	int all = 0;
      	for (int i=1; i<n+1; i++) {
			if(b[i]>0){
				all += b[i]*(b[i]-1)/2;
			}
		}
		for (int i=0; i<a.length; i++) {
			int x = a[i];
			System.out.println(all-(b[x]-1));
        }
	}
}