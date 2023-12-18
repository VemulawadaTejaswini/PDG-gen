import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	public static void main(String[] args) {
		int x =sc.nextInt();
		int y =sc.nextInt();
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		Integer aa[]= new Integer[a];
		Integer bb[]= new Integer [b];
		Integer cc[]= new Integer[c];
		Integer ans1[]=new Integer[x+y+c];
		for(int i=0;i<x+y+c;i++) {
			ans1[i]=0;
		}
		for(int i=0;i<a;i++) {
			aa[i]=0;
		}
		for(int i=0;i<b;i++) {
			bb[i]=0;
		}
		for(int i=0;i<c;i++) {
			cc[i]=0;
		}
		
		
		
		
		
		
		
		for(int i=0;i<a;i++) {
			aa[i] =sc.nextInt();
		}
		Arrays.sort(aa, Collections.reverseOrder());
		for(int i=0;i<b;i++) {
			bb[i] =sc.nextInt();
		}
		Arrays.sort(bb,Collections.reverseOrder());
		for(int i=0;i<c;i++) {
			cc[i] =sc.nextInt();
		}
		Arrays.sort(cc,Collections.reverseOrder());
		
		for(int i=0;i<x;i++) {
			ans1[i]=aa[i];
		}
		for(int i=0;i<y;i++) {
			ans1[i+x]=bb[i];
		}
		int t=0;
		for(int i:cc) {
			ans1[x+y+t]=i;
			t++;
		}
		Arrays.sort(ans1,Collections.reverseOrder());
		int FinalAnswer=0;
		for(int i=0;i<x+y;i++) {
			FinalAnswer+=ans1[i];
		}
		p(FinalAnswer);
	}
}