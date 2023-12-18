public class AC70B {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int[] A= new int[2];
		int[] B  = new int[2];
		int max_low=0;
		int min_high=0;
		
		for(int i=0; i<2; i++)
		{
			A[i]=sc.nextInt();
		}
		for(int i=0; i<2; i++)
		{
			B[i]=sc.nextInt();
		}
		
		max_low=Math.max(A[0],B[0]);
		min_high= Math.min(A[1],B[1]);
		
		if (max_low>min_high)
			System.out.println("0");
		
		else
			System.out.println(max_low-min_high);
		
		
	}
}
