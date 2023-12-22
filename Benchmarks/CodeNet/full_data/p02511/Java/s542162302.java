import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			if(n == 1){System.out.println(sc.nextInt()); continue;}

			int[] x = new int[n];
			for(int i=0;i<n;i++) x[i] = sc.nextInt();

			int i = 0;
			while(i < n){
				int si = i;
				for(;i < n-1 && x[i]==x[i+1]-1;i++);

				if(i - si < 1) System.out.print(x[si]);
				else System.out.print(x[si] + "-" + x[i]);

				if(i != n-1) System.out.print(" ");
				else System.out.println();

				i++;
			}
 		}

	}
}