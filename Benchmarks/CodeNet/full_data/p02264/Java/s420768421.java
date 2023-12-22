import java.io.*;
import java.util.*;

public class Main
{
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		Deque<String> nameQue = new ArrayDeque<>();
		Deque<Integer> workQue = new ArrayDeque<>();
		int n = Integer.parseInt(sc.next());
		int time =  Integer.parseInt(sc.next());
		int[][] data = new int[n][2];
		String[] stemp ;
		for(int i= 0 ; i< n ; i++){
			stemp = br.readLine().split(" "); 
			nameQue.offer(stemp[0]);
			workQue.offer(Integer.parseInt(stemp[1]));
		}
		roundSche(nameQue,workQue,time);
	}
	public static void roundSche(Deque<String> nameQ , Deque<Integer> workQ , int time)
	{
		int pos , prog = 0;
		int temp ;
		while(workQ.size() != 0)
		{
			temp =  workQ.poll();
			if(temp <= time){
				prog += temp;
				sb.append(nameQ.poll()).append(' ').append(prog).append('\n');
			}
			else 
			{
				workQ.offer(temp - time);
				nameQ.offer(nameQ.poll());
				prog += time;
			}
		}
		System.out.print(sb);
		
	}
	
}