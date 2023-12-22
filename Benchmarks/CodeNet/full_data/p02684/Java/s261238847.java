import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		long k = Long.parseLong(scan.next());
		int[] a = new int[n];
		for (int i = 0;i < n; ++i){
			a[i] = Integer.parseInt(scan.next());
		}

		int[] memo = new int[n];
		int index  = 0;
		int count = 1;
		while(true){
			if (memo[a[index]-1] != 0){
				break;
			}

			memo[a[index]-1] = count++;
			index = a[index] - 1;
		}
		k%=count;
		index = 0;
		for(int i = 0;i < k; ++i){
			index = a[index] - 1;
		}
		System.out.print(a[index]);


	}

}


//end