import java.io.*;

class Main{
        private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        private static void swap(int[] A, int i, int j){
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
        }

        private static void printArray(int[] A){
                for(int i=0; i<A.length; i++)
                        System.out.println(A[i]);
        }
        private static void printArrayInOneLine(int[] A){
                for(int i=0; i<A.length; i++){
                        System.out.print(A[i]);
                        if(i!=A.length-1)
                                System.out.print(" ");
                }
                System.out.println();
        }

        private static int insertSort(int[] A, int n, int g){
                int count = 0;
                int v = 0;
                int j = 0;
                for(int i=g; i<n; i++){
                        v = A[i];
                        j = i - g;
                        while(j>=0 && A[j] > v){
                                A[j+g] = A[j];
                                j -= g;
                                count++;
                        }
                        A[j+g] = v;
                }
                return count;
        }
        private static int shellSort(int[] A, int n){
                int count = 0;
                int m = 3;
                int[] G = {5, 3, 1};
                for(int i=0; i<m; i++)
                        count += insertSort(A, n, G[i]);
                System.out.println(m);
                printArrayInOneLine(G);
                return count;
        }

        public static void main(String[] args) throws IOException{
                int N = Integer.parseInt(br.readLine());
                int[] A = new int[N];

                for(int i=0; i<N; i++)
                        A[i] = Integer.parseInt(br.readLine());

                int count = shellSort(A, N);

                printArray(A);
        }
}