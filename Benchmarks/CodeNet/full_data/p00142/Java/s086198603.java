import java.util.*;
public class Main{

	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 1; i < n; i++) {
				int tmp = (i*i) % n;
				if(list.contains(tmp)) continue;
				list.add(tmp);
			}
			
			int[] a = new int[(n-1)/2+1];
			for(int i = 0; i < list.size(); i++) {
				for(int j = 0; j < list.size(); j++) {
					if(i == j) continue;
					int b = list.get(i) - list.get(j);
					if(b < 0) b += n;
					if(b > (n-1)/2) b = n - b;
					a[b]++;
				}
			}
			for(int i = 1; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
	}
}