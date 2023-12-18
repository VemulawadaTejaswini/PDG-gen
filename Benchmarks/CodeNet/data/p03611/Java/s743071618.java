import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums = sc.nextInt();
		int[] arr = new int[nums];
		while (nums-- > 0)
			arr[nums]=sc.nextInt();
		together solver = new together();
		System.out.println(solver.solve(arr));
		
	}
		private static class together
		{
			private int count = 0;
			private int max_count =0;
			private int ope =3;
			
			public int solve (int[] ints)
			{
				for (int i= 0; i<ints.length; i++)
				{
					for (int j=0 ;j<ints.length; j++)
					{
						if(ints[i]==ints[j])
						{
							count++;
						}
						else if ((ints[i]==ints[j]+1 || ints[i]==ints[j]-1) && ope>0)
						{
							count++;
							ope--;
						}	
					}
					if(count>max_count)
					{
						max_count=count;
					}
					count = 0;
				}
				return max_count;
			}
		}
	

}