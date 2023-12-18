import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
		Job[] a=new Job[n];
		for(int i=0; i<n; i++){
			a[i]=new Job(sc.nextInt()-1,sc.nextInt());
		}
		Arrays.sort(a);
		long ans=0;
		int ain=0;
		for(int i=0; i<m; i++){
			while(ain<n && a[ain].day==i){
				q.add(a[ain].salary);
				ain++;
			}
			if(!q.isEmpty()){
				ans+=q.poll();
			}
		}
		System.out.println(ans);
	}
	static class Job implements Comparable<Job>{
		int salary,day;
		public Job(int day,int salary){
			this.salary=salary;
			this.day=day;
		}
		@Override
		public int compareTo(Job j){
			return this.day-j.day;
		}
	}
}
