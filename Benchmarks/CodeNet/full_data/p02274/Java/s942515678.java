import java.util.Scanner;

public class Main {
	
	static int[] s;
	static int max = 1000000001;
	static long count =0;
	
	static void merge(int s[], int left,int mid,int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for(int i=0;i<n1;i++) {
			L[i] = s[left + i];
		}
		L[n1] = max;
		for(int i=0;i<n2;i++) {
			R[i] = s[mid + i];
		}
		R[n2] = max;
		
		for(int i=0, j=0, k=left;k<right;k++) {
			if(L[i] <= R[j]) {
				s[k] = L[i];
				i++;
			}else {
				s[k] = R[j];
				j++;
				count += n1-i;
			}
		}
	}
	
	static void mergeSort(int s[],int left,int right) {
		if(left + 1 < right) {
			int mid = (left + right)/2;
			mergeSort(s,left,mid);
			mergeSort(s,mid,right);
			merge(s,left,mid,right);
		}
	}
	
	void main() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		s = new int[n];
		for(int i=0;i<n;i++) {
			s[i] = sc.nextInt();
		}
		
		int left = 0;
		int right = n;
		mergeSort(s,left,right);
		
//		System.out.print(s[0]);
//		for(int i=1;i<n;i++) {
//			System.out.print(" " + s[i]);
//		}
//		System.out.println();
		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().main();
	}

}

