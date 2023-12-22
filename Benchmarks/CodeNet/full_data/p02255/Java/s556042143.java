public class Main {
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int[] A = new int[n];
		int i, j, v;
		
		for(i=0; i<n; i++){
			A[i] = Integer.parseInt(args[i+1]);
			System.out.print(A[i]+ " ");
		}
		System.out.println();
		for(i=1; i<n; i++){
			v = A[i];
			j = i - 1;
			while(j>=0 && v<A[j]){
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			for(int k = 0; k<n; k++)
				System.out.print(A[k]+ " ");
			System.out.println();
		}
	}
}