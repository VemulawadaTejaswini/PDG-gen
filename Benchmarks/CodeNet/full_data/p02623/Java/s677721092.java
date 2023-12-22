import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();int M=sc.nextInt();int K=sc.nextInt();
		int count=0;int sum=0;
		Stack<Integer> s=new Stack<Integer>();
		for(int i=0;i<N+M;i++) s.add(sc.nextInt());
		Collections.sort(s,Collections.reverseOrder());
		if(s.peek()<=K) {
			while(sum<=K&&s.size()!=0) {
			sum+=s.pop();
			if(sum<=K) count++;
			}
		}
		System.out.println(count);
		
		
	}

}
