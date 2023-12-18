import java.util.Scanner;
import java.util.Arrays;

class QuickSort {
    static void sort(int[] a, int[] b){
        partialySort(a, b, 0, a.length - 1);
    }

    static void partialySort(int[] a, int[] b, int left, int right){
        if(right <= left)
            return;
        
        int pivot = a[(left+right)/2];
        int i = left;
        int j = right;
        int temp;
        while(i <= j){
            while(a[i] < pivot)
                i++;
            while(a[j] > pivot)
                j--;
            if(i <= j){
                temp = a[i];
                a[i] = a[j];
				a[j] = temp;
				temp = b[i];
				b[i] = b[j];
				b[j] = temp;
                i++;
                j--;
            }
        }

        partialySort(a, b, left, j);
        partialySort(a, b, i, right);
    }
}

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		Integer[] a = new Integer[n];
		for(int i=0; i<n; i++){
			a[i] = stdIn.nextInt();
		}
		int[] b = new int[m];
		int[] c = new int[m];
		for(int i=0; i<m; i++){
			b[i] = stdIn.nextInt();
			c[i] = stdIn.nextInt();
		}

		Arrays.sort(a);

		QuickSort.sort(c, b);

		int aIdx = 0;
		int bcIdx = m-1;
		while(aIdx < n && bcIdx >= 0 && a[aIdx] < c[bcIdx]){
			a[aIdx] = c[bcIdx];
			aIdx++;
			b[bcIdx]--;
			if(b[bcIdx] <= 0){
				bcIdx--;
			}
		}

		long sum = 0;
		for(int i=0; i<n; i++){
			sum += a[i];
		}
		System.out.println(sum);
	}
}
