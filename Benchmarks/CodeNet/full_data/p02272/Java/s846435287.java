import java.io.*;
import java.util.*;

class Main {
    
    private static int cnt = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        reader.close();
        
        mergeSort(arr, 0, n-1);
        System.out.print(arr[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println(cnt);
    }
    
    private static void mergeSort(int[] arr, int floor, int ceiling) {
        if (floor < ceiling) {
            int mid = floor + (ceiling - floor) / 2;
            mergeSort(arr, floor, mid);
            mergeSort(arr, mid+1, ceiling);
            merge(arr, floor, mid, ceiling);
        }
    }
    
    private static void merge(int[] arr, int floor, int mid, int ceiling) {
        int n1 = mid - floor + 1;
        int n2 = ceiling - mid;
        int[] L = new int[n1+1];
        int[] R = new int[n2+1];
        for (int i = 0; i < n1; i++) L[i] = arr[floor + i];
        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int k = floor; k <= ceiling; k++) {
            cnt++;
            if (L[i] < R[j]) {
                arr[k] = L[i++];
            } else {
                arr[k] = R[j++];
            }
        }
    }
}

