import java.util.Scanner;

public class Main{

	static int count = 0;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] A = new int[n];

		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		int p = partition (A, 0, n-1);

		StringBuilder sb = new StringBuilder();
        int outLen = A.length;

        if(p != 0){
            sb.append(A[0]);
        }
        else{
            sb.append("[" + A[0] + "]");
        }
        for(int i = 1; i < outLen ; i++){
            if(i == p){
                sb.append(" ["+ A[i] + "]");

            }
            else{
                sb.append(" "+ A[i]);

            }
        }
        System.out.println(sb);
	}

	static int	 partition (int[] A, int p, int r) {
		int x = A[r];
		int i = p - 1;

		for(int j = p; j < r; j++) {
			if(A[j] <= x) {
				i = i + 1;
				swap(A, i, j);
			}
		}

		swap(A, i+1, r);
		return i + 1;
	}

	private static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}


}
