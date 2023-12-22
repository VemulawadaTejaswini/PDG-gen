import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int comfort=0;
		for(int i=0;i<n;i++) {
			int a=scn.nextInt();
			arr.add(a);
		}Collections.sort(arr, Collections.reverseOrder());
		int diff=1;
		for(int i=1;i<n;i++) {
			comfort+=arr.get(i-diff);
			if(i>2 && i%2!=0) {
				diff++;
			}
		}System.out.println(comfort);
	}
}