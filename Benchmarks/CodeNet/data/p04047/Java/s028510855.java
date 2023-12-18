import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int[] test = new int[2*N];
			for( int i=0; i<2*N; i++)
			{
				test[i] = in.nextInt();
			}
			System.out.println(findmax(test));
		}
		in.close();
	}
	
	public static int findmax(int[] n)
	{
		quicksort(n,0,n.length-1);
		int sum = 0;
		for( int i=0; i<n.length; i=i+2)
		{
			sum += n[i];
		}
		return sum;
	}
	
    public static void quicksort(int n[], int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(n, left, right);
            quicksort(n, left, dp - 1);
            quicksort(n, dp + 1, right);
        }
    }
    
    public static int partition(int n[], int left, int right) {
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot)
                right--;
            if (left < right)
                n[left++] = n[right];
            while (left < right && n[left] <= pivot)
                left++;
            if (left < right)
                n[right--] = n[left];
        }
        n[left] = pivot;
        return left;
    }
}