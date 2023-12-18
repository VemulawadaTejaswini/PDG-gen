import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {

	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		
//		int a[] = new int[n];
//		for(int i=0;i<n;i++)
//			a[i] = s.nextInt();
		
		int n = s.nextInt();
		Pair3 a[] = new Pair3[n];
		
		for(int i=0;i<n;i++) {
			a[i] = new Pair3(s.next(),s.nextInt());
		}
		String k = s.next();
		int sum=0,flag=0;
		for(Pair3 i:a) {
			if(flag==1) {
				sum+=i.ctr;
			}
			if(i.num.compareTo(k)==0) {
				flag=1;
			}
		}
		System.out.println(sum);
		
		
	}
}
class Pair3 {

	String num;
	int ctr;
	Pair3(String a,int b){
		num=a;
		ctr=b;
	}
	
	
}

