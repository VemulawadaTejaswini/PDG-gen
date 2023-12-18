import java.util.Arrays;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;
 
 
public class MinPositiveInterval {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinPositiveInterval mpi = new MinPositiveInterval();
		mpi.run();
	}
	
	final int SIZE = 500;
	final int RANGE = 100;
	final int RUNS = 100;
	final int INF = (int)1e9;
	
	private void run() {
		for (int j = 0; j < RUNS; j++) {
			int[] A = new int[SIZE];
			Random r = new Random();
			for (int i = 0; i < SIZE; i++)
				A[i] = r.nextInt(2 * RANGE) - RANGE;
			
			int algoSol = minInterval(A);
			int verSol = verify(A);
			
			if(algoSol != verSol)
			{
				System.out.println("Algorithm failed on the following input:");
				print(A,"A");
				System.out.printf("Algo solution:%d correct solution:%d", algoSol, verSol);
				return;
			}
		}
		System.out.println("Algorithm was correct for all testcases");
	}
 
	// THE MAIN METHOD OF THE ALGORITHM
	private int minInterval(int[] A) {
		int[] cumSum = new int[A.length];
		cumSum[0] = A[0];
		
		TreeSet<Integer> sums = new TreeSet<Integer>();
		int min = INF;
		for(int i=1; i<A.length; i++)
		{
			cumSum[i] = cumSum[i-1] + A[i];
		}
		for(int i=0; i<A.length; i++)
		{
			SortedSet<Integer> head = sums.headSet(cumSum[i]); 
			if(!head.isEmpty())
				min = Math.min(min, cumSum[i] - head.last());
			if(cumSum[i]>0)
				min = Math.min(min, cumSum[i]);
			sums.add(cumSum[i]);
		}
		return min;
	}
	
	private int verify(int[] A) {
		int min = INF;
		for(int i=0; i<A.length; i++)
			for(int j=i; j<A.length; j++)
			{
				int sum = 0;
				for(int k=i; k<=j; k++)
					sum += A[k];
				if(sum > 0)
					min = Math.min(min, sum);
			}
		return min;
	}
	
	void print(int[] A, String s)
	{
		System.out.println(s+Arrays.toString(A));
	}
}