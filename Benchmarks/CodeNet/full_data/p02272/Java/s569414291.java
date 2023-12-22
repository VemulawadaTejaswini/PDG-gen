import java.util.Scanner;

public class Main {

	private static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		int n = sc.nextInt();
        String aStr = sc.next();
        int[] s = toIntAry(aStr, n);

        int[] ret = mergeSort(s,0,n);

        for (int i = 0; i < ret.length; i++) {
			System.out.print(ret[i] + " ");
		}
        System.out.println();
        System.out.println(count);

	}




	private static int[] mergeSort(int[] A, int left, int right) {
		if(left+1 < right){
			int mid = (left+right)/2;
			mergeSort(A,left,mid);
			mergeSort(A, mid, right);
			merge(A,left,mid,right);
		}

		return A;

	}




	private static void merge(int[] a, int left, int mid, int right) {
		final int MAX = 2147483647;
		int n1 = mid - left;
		int n2 = right -mid;
		int[] l1 = new int[n1+1];
		int[] r1 = new int[n2+1];
		for(int i=0; i<n1; i++){
			l1[i] = a[left+i];
		}
		for(int i=0; i<n2; i++){
			r1[i] = a[mid+i];
		}
		l1[n1] = MAX;
		r1[n2] = MAX;
		int i=0;
		int j=0;
		for(int k=left; k<right; k++){
			if(l1[i] <= r1[j]){
				a[k] = l1[i];
				i++;
				count++;
			}else{
				a[k] = r1[j];
				j++;
				count++;
			}
		}
	}




	private static int[] toIntAry(String str, int n) {
        String[] tmp = str.split(" ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(tmp[i]);
		}
        return A;
	}


}