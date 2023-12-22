import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		
		Queue<Integer> a=new LinkedList<Integer>();
		Queue<Integer> b=new LinkedList<Integer>();
		for(int i=0;i<N;i++) {
			a.add(sc.nextInt());
		}
		for(int i=0;i<M;i++) {
			b.add(sc.nextInt());
		}
		
		int ans=0;
		int sum=0;
		if(a.peek()<=K) {
			int i=0;
			while(sum<=K) {
				if(i%2==0&&a.size()!=0) {
					sum=sum+a.poll();
					if(sum<=K) ans++;
					i++;
				}else if(i%2!=0&&b.size()!=0) {
					sum=sum+b.poll();
					if(sum<=K) ans++;
					i++;
				}
			}
		}
		
		System.out.println(ans);

	}

}
