import java.util.*;
import java.util.stream.*;

class Main {
    public static int count = 0;
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] S = new int[n];
	for (int i = 0; i < n; i++) {
	    S[i] = in.nextInt();
	}
	mergeSort(S, 0, n);
	System.out.println(IntStream.of(S)
			   .mapToObj(String::valueOf)
			   .collect(Collectors.joining(" ")));
	System.out.println(count);
    }

    public static void merge(int[] S, int left, int mid, int right) {
	int n1 = mid - left, n2 = right - mid;
	int[] L = new int[n1 + 1], R = new int[n2 + 1];
	for (int i = 0; i < n1; i++) {
	    L[i] = S[left + i];
	}
	for (int i = 0; i < n2; i++) {
	    R[i] = S[mid + i];
	}
	L[n1] = R[n2] = Integer.MAX_VALUE;
	int i = 0, j = 0;
	for (int k = left; k < right; k++) {
	    count++;
	    if (L[i] <= R[j]) {
		S[k] = L[i++];
	    } else {
		S[k] = R[j++];
	    }
	}
    }

    public static void mergeSort(int[] S, int left, int right) {
	if (left + 1 < right) {
	    int mid = (left + right) / 2;
	    mergeSort(S, left, mid);
	    mergeSort(S, mid, right);
	    merge(S, left, mid, right);
	}
    }
}

