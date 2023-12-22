import java.util.*;

public class Main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0; i<n; i++){
			int[] a = new int[3];
			a[0] = s.nextInt();
			a[1] = s.nextInt();
			a[2] = s.nextInt();
			Arrays.sort(a);
			if(a[2]*a[2] == a[0]*a[0] + a[1]*a[1]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
