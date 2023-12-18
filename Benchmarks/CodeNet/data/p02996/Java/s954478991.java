import java.util.Scanner;

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
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0; i<n; i++){
			a[i] = stdIn.nextInt();
			b[i] = stdIn.nextInt();
		}

		QuickSort.sort(b, a);

		int time = 0;
		for(int i=0; i<n; i++){
			time += a[i];
			if(time > b[i]){
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}
