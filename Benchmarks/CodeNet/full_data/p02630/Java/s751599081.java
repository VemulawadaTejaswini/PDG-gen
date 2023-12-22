import java.math.*;
import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int n = scn.nextInt();
		for(int i=0;i<n;i++) {
			int a=scn.nextInt();
			arr.add(a);
		}int sum=0;
		for(int j=0;j<arr.size();j++) {
			sum+=arr.get(j);
		}
		int q = scn.nextInt();
		for(int i=0;i<q;i++) {
			int x=scn.nextInt();
			int y=scn.nextInt();
			for(int j=0;j<arr.size();j++) {
				if(arr.get(j)==x) {
					arr.set(j, y)
					sum+=y-x;
				}
			}System.out.println(sum);
		}
	}
}	