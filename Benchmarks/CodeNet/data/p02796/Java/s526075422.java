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
		int x, l;
		for(int i=0; i<n; i++){
			x = stdIn.nextInt();
			l = stdIn.nextInt();
			a[i] = x - l;
			b[i] = x + l;
		}

		QuickSort.sort(a, b);

		boolean[][] adMatrix = new boolean[n][n];
		Outer:
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				if(b[i] <= a[j]){
					continue Outer;
				}else{
					adMatrix[i][j] = true;
					adMatrix[j][i] = true;
				}
			}
		}

		int remove = 0;
		int[] trueCnt = new int[n];
		while(!allFalse(adMatrix)){
			for(int i=0; i<n; i++){
				int cnt = 0;
				for(int j=0; j<n; j++){
					if(adMatrix[i][j])
						cnt++;
				}
				trueCnt[i] = cnt;
			}
			int max = 0;
			int maxIdx = 0;
			for(int i=0; i<n; i++){
				if(max < trueCnt[i]){
					max = trueCnt[i];
					maxIdx = i;
				}
			}

			for(int i=0; i<n; i++){
				adMatrix[i][maxIdx] = false;
			}
			for(int j=0; j<n; j++){
				adMatrix[maxIdx][j] = false;
			}

			remove++;
		}

		System.out.println(n - remove);
	}

	static boolean allFalse(boolean[][] a){
		int n = a.length;
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				if(a[i][j]){
					return false;
				}
			}
		}
		return true;
	}
}
