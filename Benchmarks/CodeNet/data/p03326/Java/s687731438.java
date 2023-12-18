import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] tasu_min= {1,-1};
		int N=sc.nextInt();
		int M=sc.nextInt();

		long[][] tensu=new long[N][3];
		long[] wa=new long[N];

		for(int i=0; i<N; i++) {
			tensu[i][0]=sc.nextLong();
			tensu[i][1]=sc.nextLong();
			tensu[i][2]=sc.nextLong();
		}
		int wamax=-114514;
		int tmpwa=0;
		for(int i=0; i<8; i++) {
			for(int j=0; j<N; j++) {
				wa[j]=tensu[j][0]*(tasu_min[i%2])+tensu[j][1]*(tasu_min[(i/2)%2])+tensu[j][2]*(tasu_min[(i/4)%2]);
			}
			wa=mSort(wa);
			for(int j=N-1; j>=N-M; j--) {
				tmpwa+=wa[j];
			}
			if(tmpwa>wamax) {
				wamax=tmpwa;
			}
			tmpwa=0;
		}
		System.out.println(wamax);
	}

	public static long[] mSort(long array[])  {
		if(array.length > 1) {
			int elementsInA1 = array.length/2;
			int elementsInA2 = array.length - elementsInA1;
			long arr1[] = new long[elementsInA1];
			long arr2[] = new long[elementsInA2];

			for(int i = 0; i < elementsInA1; i++)
				arr1[i] = array[i];

			for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
				arr2[i - elementsInA1] = array[i];

			arr1 = mSort(arr1);
			arr2 = mSort(arr2);

			int i = 0, j = 0, k = 0;

			while(arr1.length != j && arr2.length != k) {
				if(arr1[j] <= arr2[k]) {
					array[i] = arr1[j];
					i++;
					j++;
				} else {
					array[i] = arr2[k];
					i++;
					k++;
				}
			}

			while(arr1.length != j) {
				array[i] = arr1[j];
				i++;
				j++;
			}
			while(arr2.length != k) {
				array[i] = arr2[k];
				i++;
				k++;
			}
		}
		return array;
	}
}