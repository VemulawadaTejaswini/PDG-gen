import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++){
			a[i] = scn.nextInt();
		}
      	int count = 1;
      	for(int i=0; i<a.length; i++){
			if(a[i]==count) count++;
		}
      	int ans = n+1-count;
      	if(ans == n) System.out.println("-1");
        else System.out.println(ans);
	}
}
