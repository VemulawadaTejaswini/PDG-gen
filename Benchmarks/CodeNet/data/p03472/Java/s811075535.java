import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
	//	long[][] w= new long [N][2];
		Queue w = new PriorityQueue(Collections.reverseOrder());
		long maxthrow = 0;
		int maxatk = 0;
		int res = 0;
		for(int i = 0 ; i<N; i++){
			int atk = sc.nextInt();
			int thr = sc.nextInt();
			w.add(thr);
			maxatk = Math.max(maxatk, atk);
			maxthrow += thr;
		}
	//	System.out
		while(!w.isEmpty()){
			if(maxatk > (int)w.peek()){
		//		System.out.println(maxatk+"  "+w.peek());
				break;
			}
			H-=(int)w.poll();
			res++;
	//		System.out.println(H);
		}
		res+=H/maxatk;
	//	System.out.println()
		if(H%maxatk>0)res++;
	/*	while(H>0){
			H-=maxatk;
			res++;
		}*/
		System.out.println(res);
	}
}
