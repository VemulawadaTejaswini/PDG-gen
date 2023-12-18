public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = new java.util.Scanner(System.in).nextInt();
		int M = new java.util.Scanner(System.in).nextInt();
		int count = 0;
		int sum = 0;
		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i] = new java.util.Scanner(System.in).nextInt();
			sum += A[i];
			//if(A[i]<=1/(4*M)){
				//System.out.println(A[i]);
				//count++;
			//}
		}
		for(int i=0;i<N;i++){
			if(A[i]>=sum*1/(4*M)){
			//System.out.println(A[i]);
			count++;
			}
		}
		if (count>=M){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}


