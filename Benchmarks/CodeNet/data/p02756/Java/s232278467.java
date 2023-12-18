import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int ttt=sc.nextInt();
		ArrayDeque<String> q=new ArrayDeque<>();
		q.add(s);
		boolean ch=true;
		for(int i=0; i<ttt; i++){
			int t=sc.nextInt();
			if(t==1){
				ch=!ch;
			}else{
				int f=sc.nextInt();
				String c=sc.next();
				if(f==1){
					if(ch){
						q.add(c);
					}else{
						q.addFirst(c);
						
					}
				}else{
					if(ch){
						
						q.addFirst(c);
					}else{
						q.add(c);
					}
				}
			}
		}
		StringBuilder ans=new StringBuilder();
		while(!q.isEmpty()){
			if(ch){
				ans.append(q.pollLast());
			}else{
				ans.append(q.poll());
			}
		}
		System.out.println(ans);
	}
}
