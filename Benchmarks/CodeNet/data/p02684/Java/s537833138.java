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
		int[] first = new int[n];
		int[] second = new int[n];

		//first
		int index  = 0;
		int count = 1;
		while(true){
			if (first[a[index]-1] != 0)break;

			first[a[index]-1] = count++;
			index = a[index] - 1;
		}
		//second
		while(true){
			if (second[a[index]-1] != 0)break;
			second[a[index]-1] = count++;
			index = a[index] - 1;
		}

		for(int i = 0;i < n ; ++i){
			if (first[i] == 0)continue;

			if ((k-first[i])%(second[i]-first[i]) == 0){
				System.out.print(i+1);
				break;
			}
		}

	}

}


//end