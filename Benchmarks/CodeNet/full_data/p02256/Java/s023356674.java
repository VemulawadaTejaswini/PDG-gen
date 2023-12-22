import java.io.*;

class Main{
        static void sort(int[] A){
                if(A[0]<A[1]){
                        int t = A[0];
                        A[0] = A[1];
                        A[1] = t;
                }
        }
        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s[] = br.readLine().split(" ");
                int A[] = {0, 0};

                for(int i=0; i<2; i++)
                        A[i] = Integer.parseInt(s[i]);
                sort(A);
                while((A[0]>1)&&A[1]!=0&&(A[0]!=A[0]%A[1])){
                        int t = A[0];
                        A[0] = A[1];
                        A[1] = t%A[1];
                        sort(A);
                }
                System.out.println(A[0]);
        }
}