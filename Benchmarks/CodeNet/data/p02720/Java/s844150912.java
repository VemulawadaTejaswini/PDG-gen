import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),count=0;
		sc.close();
		Queue<Long> q = new ArrayDeque<>();
		for(long i=1;i<10;i++) q.add(i);
		while(true) {
			long temp = q.poll();
			count++;
			if(count==n) {
				System.out.println(temp);
				return ;
			}
			if(temp%10!=0) q.add(10*temp+temp%10-1);
			q.add(10*temp+temp%10);
			if(temp%10!=9) q.add(10*temp+temp%10+1);
		}
	}
}