import java.io.*;
 
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder out = new StringBuilder();
 
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        String[] in = br.readLine().split(" ");
        for (int i=0; i<n; i++) A[i] = Integer.parseInt(in[i]);
        trace(A, n);
 
        for(int i=1; i<n; i++) {
            int key = A[i];
            int j=i-1;
            while(j>=0 && A[j]>key) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
            trace(A, n);
        }
        System.out.print(out);
    }
     
    static void trace(int A[], int n){
        for (int i=0; i<n; i++){
            if(i>0) out.append(' ');
            out.append(A[i]);
        }
        out.append('\n');
    }
}