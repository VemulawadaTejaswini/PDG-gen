import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        printArray(a, n);
        insertionSort(a, n);
    }
 
    private static void insertionSort(int[] a, int n) {
        for(int i = 1; i < n; i++) {
            int v = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > v) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = v;
            printArray(a, n);
        }
    }
 
    private static void printArray(int[] a, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(i != 0) sb.append(" ");
            sb.append(a[i]);
        }
        System.out.println(sb);
    }
}
