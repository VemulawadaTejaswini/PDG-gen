import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int a=scn.nextInt();
			arr.add(a);
		}Collections.sort(arr);
		if(n%2==0) {
			int r=1;
			for(int i=0;i<n;i++) {
				arr.remove(new Integer (r));
				arr.remove(new Integer (r));
				r+=2;
			}
		}else {
			arr.remove(new Integer (0));
			int r=2;
			for(int i=1;i<n;i++) {
				arr.remove(new Integer (r));
				arr.remove(new Integer (r));
				r+=2;
			}
		}if(arr.size()!=0) {
			System.out.println(0);
		}else {
			int pow=n/2;
			long ans=(long) Math.pow(2, pow);
			System.out.println(ans);
		}
	}
}