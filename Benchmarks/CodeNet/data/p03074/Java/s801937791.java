import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		String s=sc.next();

		List<Integer> list=new ArrayList<>();

		int begin=0;
		char now='1';

		for(int i=0;i<N;i++) {
			if(s.charAt(i)!=now) {
				list.add(i-begin);
				now=s.charAt(i);
				begin=i;
			}
		}
		list.add(N-begin);
		if(now == '0')	list.add(0);

		/*
		for(int i:list) System.out.print(i+" ");
		System.out.println();
		 */

		int[] sum=new int[list.size()+1];
		for(int i=0;i<list.size();i++) {
			sum[i+1]=sum[i]+list.get(i);
		}

		int result = 0;


		for(int i = 0; i < list.size(); i+=2) {

			int Left = i;
			int Right = Math.min(i+K*2+1, list.size());

			int tmp=sum[Right]-sum[Left];

			//System.out.println(String.format("left:%d right:%d tmp:%d",Left,Right,tmp));

			result = Math.max(tmp, result);
		}

		System.out.println(result);


		sc.close();
	}

}
