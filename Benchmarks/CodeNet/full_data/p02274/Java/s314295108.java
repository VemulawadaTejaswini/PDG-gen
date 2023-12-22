import java.util.Scanner;
public class Main {
    static long counter = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] ls = new int[n];
        for(int x = 0; x < n; x++){
            ls[x] = scan.nextInt();
        }
        merge_sort(ls, 0, n);
        System.out.println(counter);
    }
    public static void merge_sort (int[] lst, int left, int right) {
        if(left + 1 < right){
            int mid = (left + right)/2;
            merge_sort(lst, left, mid);
            merge_sort(lst, mid, right);
            merge(lst, left, mid, right);
        }
    }
    public static void merge(int[] A, int left, int mid, int right) {
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
        L[n1] = R[n2] = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        for(int i = left; i < right; i++){
            if (L[l] <= R[r]){
                A[i] = L[l++];
                counter = counter + r;
            }
            else{
                A[i] = R[r++];
            }
        }
    }
}
