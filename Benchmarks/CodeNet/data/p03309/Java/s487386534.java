import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int ar[] = new int[N];
		int sm = 0,sum = 0;

		for(int n=0;n<N;n++){
			int v = sc.nextInt();
			ar[n] = v;
			sm += ar[n];
			arr[n] = v-n-1;
			sum += arr[n];
		}
		Arrays.sort(arr);

		if(N%2==1){
			int mid = arr[N/2];
			int s = 0;
			for(int n=0;n<N;n++){
				s += Math.abs(ar[n] - mid - n -1);
			}
			System.out.println(s);
		}
		else{
			int mid1 = arr[N/2-1];
			int mid2 = arr[N/2];
			int s1=0,s2=0;
			for(int n=0;n<N;n++){
				s1 += Math.abs(ar[n] - mid1 - n - 1);
				s2 += Math.abs(ar[n] - mid2 - n - 1);
			}
			System.out.println(Math.min(Math.abs(s1),Math.abs(s2)));
		}
	}
}