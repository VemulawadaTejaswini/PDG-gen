public class Main {
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int[] A = new int[n];
		int i, j, v;
		
		for(i=0; i<n; i++){
			A[i] = Integer.parseInt(args[i]);
			System.out.print(A[i]+ " ");
		}
		for(i=1; i<n-1; i++){
			v = A[i];
			j = i - 1;
			while(0>=j && v<A[j]){
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			for(int k = 0; k<n; k++)
				System.out.println(A[k]+ " ");
		}
	}
}