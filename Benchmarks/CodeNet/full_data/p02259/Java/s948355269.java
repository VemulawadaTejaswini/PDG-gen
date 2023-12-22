import java.io.*;

class Main{
        private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        private static void swap(int[] A, int i, int j){
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
        }

        private static void printArray(int[] A){
                for(int i=0; i<A.length; i++){
                        System.out.print(A[i]);
                        if(i!=A.length-1)
                                System.out.print(" ");
                }
                System.out.println();
        }

        public static void main(String[] args) throws IOException{
                int N = Integer.parseInt(br.readLine());
                String[] iline = br.readLine().split(" ");
                int[] A = new int[N];
                int count = 0;
                for(int i=0; i<N; i++)
                        A[i] = Integer.parseInt(iline[i]);
                for(int i=0; i<N; i++){
                        for(int j=N-1; j>i; j--)
                                if(A[j]<A[j-1]){
                                        swap(A, j, j-1);
                                        count++;
                                }
                }
                printArray(A);
                System.out.println(count);
        }
}