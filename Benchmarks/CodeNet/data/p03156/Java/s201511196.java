import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] c = new int[3];
		for(int i=0; i<n; i++){
			int temp = sc.nextInt();
			if(temp <= a)
				c[0]++;
			else if (temp <= b)
				c[1]++;
			else c[2]++;
		}
		int ans = Math.min(c[0], Math.min(c[1], c[2]));
		System.out.println(ans);
	}
}
