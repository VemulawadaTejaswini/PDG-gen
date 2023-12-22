import java.io.*;

class Main {
    static int swap = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strarr = str.split(" ", n);
        
        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = Integer.parseInt(strarr[i]);
        }
        
        selectionSort(array, n);
        
    }
    
    static void selectionSort(int[] A, int N) {
        for(int i=0; i<N; i++) {
            int minj = i;
            int iv = A[i];
            for(int j=i+1; j<N; j++) {
                if(A[j] < A[minj]) {
                    minj = j;
                }
            }
            if(i != minj) {
                A[i] = A[minj];
                A[minj] = iv;
                swap++;
            }
        }
        
        for(int i=0; i<N-1; i++) {
            System.out.printf("%d ", A[i]);
        }
        System.out.println(A[N-1]);
        System.out.println(swap);
    }
    
}
