import java.math.*;
import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int p = scn.nextInt();
			arr.add(p);
		}Collections.sort(arr);
		int ans=0;
		for(int i=0;i<k;i++) {
			ans+=arr.get(i);
		}System.out.println(ans);
	}
}	