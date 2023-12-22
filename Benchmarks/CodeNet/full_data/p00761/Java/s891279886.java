import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int l = sc.nextInt();
			if (l==0) {
				break;
			}
			HashMap<Integer, Integer> appear = new HashMap<Integer, Integer>();
			int i = 0;
			while(true) {
				if (appear.containsKey(a)) {
					int j = appear.get(a);
					System.out.println(j + " " + a + " " + (i-j));
					break;
				}else{
					appear.put(a, i);
				}
				i++;
				a = next(a,l);
			}
		}
	}
	
	public static int next(int x,int l) {
		int[] a = new int[l];
		for(int i=0;i<l;i++) {
			a[i] = x%10;
			x/=10;
		}
		Arrays.sort(a);
		int big = 0;
		int sml = 0;
		for(int i=0;i<l;i++) {
			big*=10;
			sml*=10;
			big += a[l-1-i];
			sml += a[i];
		}
		return big-sml;
	}

}