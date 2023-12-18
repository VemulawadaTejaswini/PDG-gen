import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<n; i++){
			p.add(sc.nextInt());
		}
		for(int i=0; i<m; i++){
			int a=p.poll();
			p.add(a/2);
		}
		long sum=0;
		for(int i=0; i<n; i++){
			sum+=p.poll();
		}
		System.out.println(sum);
	}
}
