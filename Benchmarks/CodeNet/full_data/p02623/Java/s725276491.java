import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		PriorityQueue<Integer> qa=new PriorityQueue<>();
		PriorityQueue<Integer> qb=new PriorityQueue<>();
		for(int i=0; i<n; i++){
			int a=sc.nextInt();
			qa.add(a);
		}
		for(int i=0; i<m; i++){
			int b=sc.nextInt();
			qb.add(b);
		}
		int ans=0;
		while(k>0){
			int sub=0;
			Integer aa=qa.peek();
			Integer bb=qb.peek();
			if(aa!=null && bb!=null){
				if(aa<bb){
					sub=qa.poll();
				}else{
					sub=qb.poll();
				}
			}else{
				if(aa==null && bb==null){
					break;
				}else if(aa==null){
					sub=qb.poll();
				}else{
					sub=qa.poll();
				}
			}
			if(k>=sub){
				ans++;
				k-=sub;
			}else{
				break;
			}
		}
		System.out.println(ans);
	}
}
