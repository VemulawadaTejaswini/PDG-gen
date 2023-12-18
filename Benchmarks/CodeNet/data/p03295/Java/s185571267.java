import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int arr[] = new int[N];

		Arrays.fill(arr,0);

		for(int m=0;m<M;m++){
			int s = sc.nextInt();
			int g = sc.nextInt();
			arr[s-1]++;
			arr[g-1]++;
		}

		int max = 0;
		for(int n=0;n<arr.length;n++){
			if(max < arr[n]) max = arr[n];
		}

		System.out.println(max);

	}

}