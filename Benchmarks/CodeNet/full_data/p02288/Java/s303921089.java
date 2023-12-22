
class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] A = new int[n + 1];
        for (int i = 1; i < n + 1; i++)
            A[i] = Integer.parseInt(sc.next());

        for (int i = A.length / 2; i > 0; i--) {
            maxHeapify(A, i);
        }

        for (int i = 1; i < A.length; i++) {
            System.out.print(" " + A[i]);
        }
        System.out.println();
        sc.close();
    }

    static private void maxHeapify(int[] A, int i) {
        int leftIndex = i * 2;
        int rightIndex = leftIndex + 1;

        // int largerIndex;
        // if(leftIndex >= A.length) largerIndex = ri
        // if(leftIndex >= A.length && rightIndex >= A.length){
        // return;
        // }

        int largerIndex = i;
        if (leftIndex < A.length && A[leftIndex] > A[i])
            largerIndex = leftIndex;
        if (rightIndex < A.length && A[rightIndex] > A[largerIndex])
            largerIndex = rightIndex;

        if (largerIndex != i) {
            swap(A, largerIndex, i);
            maxHeapify(A, largerIndex);
        }
    }

    static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
