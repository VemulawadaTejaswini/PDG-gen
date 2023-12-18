import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		int arr[] = new int[N];
		int one = -1;
		for(int n=0;n<N;n++){
			arr[n] = sc.nextInt();
			if(arr[n] == 1) one = n;
		}

		if(one == 0 || one == N-1)	System.out.println((int)Math.ceil((float)(N-1)/(M-1)));
		else{
				System.out.println((int)(Math.ceil((one+1)/(float)M) + Math.ceil((N-one+1)/(float)M)));
		}

	}
}