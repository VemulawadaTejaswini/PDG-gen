import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}
	
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		int N = file.nextInt();
		double[] ints = new double[N];
		for(int i = 0;i<N;i++)
			ints[i] = file.nextDouble();
		PriorityQueue<Double> que = new PriorityQueue<Double>();
		for(double x:ints)
			que.add(x);
		while(que.size() != 1)
		{
			double x= que.poll();
			double y = que.poll();
			que.offer((x+y)/2);
		}
		System.out.println(que.peek());
	}
}
