import java.util.*;

class Main {
        public static int[] A;
        public static int count;
        public static void main(String args[]) {
                count = 0;
                try (Scanner sc = new Scanner(System.in)) {
                        int N = sc.nextInt();
                        A = new int[N];
                        for (int i = 0; i < N; i++) {
                                A[i] = sc.nextInt();
                        }
                        mergeSort(0, N);
                        for (int i = 0; i < N; i++) {
                                System.out.print(A[i]);
                                System.out.print(i != N-1 ? " ":"\n");
                        }
                        System.out.println(count);
                }
        }
        public static void merge(int left, int mid, int right) {
                int n1 = mid - left;
                int n2 = right - mid;
                int[] L = new int[n1 + 1];
                int[] R = new int[n2 + 1];
                for (int i = 0; i < n1; i++) {
                        L[i] = A[left + i];
                }
                for (int i = 0; i < n2; i++) {
                        R[i] = A[mid + i];
                }
                L[n1] = 500001;
                R[n2] = 500001;
                int i = 0;
                int j = 0;
                for (int k = left; k < right; k++) {
                        count++;
                        if (L[i] <= R[j]) {
                                A[k] = L[i];
                                i++;
                        } else {
                                A[k] = R[j];
                                j++;
                        }
                }
        }
        public static void mergeSort(int left, int right) {
                if (left + 1 < right) {
                        int mid = (left + right) / 2;
                        mergeSort(left, mid);
                        mergeSort(mid, right);
                        merge(left, mid, right);
                }
        }
}