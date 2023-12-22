import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    int heapSize = 0;
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        heapSize = input.nextInt();
        int[] heap = new int[heapSize+1];
        for (int i = 1; i < heapSize+1; i++) {
            heap[i] = input.nextInt();
        }
        buildMaxHeap(heap);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < heapSize+1; i++) {
            sb.append(' ').append(heap[i]);
        }
        System.out.println(sb.toString());
    }
    int parent(int i) {
        return i / 2;
    }
    int left(int i) {
        return i * 2;
    }
    int right(int i) {
        return i * 2 + 1;
    }
    void buildMaxHeap(int[] A) {
        for (int i = heapSize/2; i > 0; i--) {
            maxHeapify(A, i);
        }
    }
    void maxHeapify(int[] A, int i) {
        int l = left(i);
        int r = right(i);
        int largest;
        if (l <= heapSize && A[l] > A[i]) {
            largest = l;
        } else {
            largest = i;
        }
        if (r <= heapSize && A[r] > A[largest]) largest = r;
        if (largest != i) {
            swap(A, i, largest);
            maxHeapify(A, largest);
        }
    }
    void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
    
    private static class Scanner {
        BufferedReader r;
        StreamTokenizer st;
        
        public Scanner(InputStream in) {
            r = new BufferedReader(new InputStreamReader(in));
            st = new StreamTokenizer(r);
        }
        
        public String next() {
            nextToken();
            return st.sval;
        }
        
        public Integer nextInt() {
            nextToken();
            return (int)st.nval;
        }
        
        private int nextToken() {
            int token = st.TT_EOF;
            try {
                token = st.nextToken();
            } catch (IOException e) {
            }
            return token;
        }
    }
}