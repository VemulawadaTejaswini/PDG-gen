import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int  N = sc.nextInt();
		int  M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		ArrayList<String> arr = new ArrayList<String>();

		for(int i = 0; i < M; i++)
		{
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		int min = L[0];
		for(int i = 1; i < L.length;i++)
		{
			int v = L[i];
			if(v < min)
			{
				min = v;
			}
		}

		for(int i = 0; i < M; i++)
		{int c = R[i] - L[i] + +1;
			for(int j = 0; j < c ; j++)
			{
				String ll = String.valueOf(L[i]);
				arr.add(ll);
				L[i]++;
			}
		}

		int max = R[0];
		for(int i = 1; i < R.length;i++)
		{
			int v = R[i];
			if(v > max)
			{
				max = v;
			}
		}

		int count = 0;
		for(int i = min; i <= max;i++)
		{
			int  check = 0;
			String num = String.valueOf(i);
			check = Collections.frequency(arr, num);

			if(check == M)
			{
				count++;
			}
			
		}
			System.out.println(count);

	}

}