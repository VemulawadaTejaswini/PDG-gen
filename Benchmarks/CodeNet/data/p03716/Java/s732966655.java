import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a=new long[3*n]; 
		for(int i=0;i<a.length;i++) a[i]=sc.nextLong();
		
		long score=0;
		int l=n;
		int r=2*n-1;
		PriorityQueue<Long> leftQueue=new PriorityQueue<>();
		PriorityQueue<Long> rightQueue=new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++){
			leftQueue.add(a[i]);
			score+=a[i];
			rightQueue.add(a[2*n+i]);
			score-=a[2*n+i];
		}
		
		for(int i=0;i<n;i++){
			System.out.println(leftQueue);
			System.out.println(rightQueue);System.out.println();
			if(a[l]-leftQueue.peek() > rightQueue.peek()-a[r]){
				score+= a[l]-leftQueue.poll();
				leftQueue.add(a[l]);
				l++;
			}else{
				score+= rightQueue.poll()-a[r];
				rightQueue.add(a[r]);
				r--;
			}
			
		}
		System.out.println(score);
		
	}
}
