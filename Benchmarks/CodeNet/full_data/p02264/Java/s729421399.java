import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		String name[]=new String[n];
		
		String queue[]=new String[1000000];
		int head=0, tail=0;
		int totaltime=0;
		int now=0;
		Map<String,Integer> time=new HashMap<String,Integer>();
		
		for(int i=0;i<n;++i) {
			name[i]=sc.next();
			time.put(name[i],sc.nextInt());
			totaltime+=time.get(name[i]);
			queue[tail]=name[i];
			++tail;
		}

		while(now!=totaltime) {
			if(time.get(queue[head])>q) {
				time.put(queue[head], time.get(queue[head])-q);
				queue[tail]=queue[head];
				++head;
				++tail;
				now+=q;
			}
			else {
				now+=time.get(queue[head]);
				System.out.println(queue[head]+" "+now);
				++head;
			}
		}
		

	}
}

