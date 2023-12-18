import java.util.Scanner;

class Main{
	static void swap(int[] a, int id1, int  id2){
		int t = a[id1];
		a[id1] = a[id2];
		a[id2] = t;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++)
			x[i] = stdIn.nextInt();
		int[] y = x.clone();
		for(int i = 0; i < n-1; i++)
			for(int j = n-1; j > i; j--)
				if(x[j-1] > x[j])
					swap(x, j-1, j);
					
		for(int i = 0; i < n; i++){
			if(y[i] <= x[(n+1)/2 - 1])
				System.out.println(x[(n+1)/2]);
			else
				System.out.println(x[(n+1)/2-1]);
		}
	}
}