import java.io.*;

class Main{

    public static int n, i, j;
    public static int[] A;
    public static int[] B;
    public static int[] C;


    public static void main(String[] args){
        try{
        int i;
        int j=0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = buffer.readLine();
        n = Integer.parseInt(s);
        A = new int[n+1];
        B = new int[n+1];
        /*for(i=1 ; i<=n ; i++){
          s = buffer.readLine();
            A[i] = Integer.parseInt(s.split("\\S"));
        }*/

        String[] S = buffer.readLine().split("\\s");
             j=0;
        for(i=1 ; i<=n ; i++){
            A[i] = Integer.parseInt(S[j]);
            j++;
        }
        buffer.close();
    }
    catch(IOException e){
        System.out.println(e);
    }
        int m = 0;
        for(i=1 ; i<=n ; i++){
        if(m < A[i])m = A[i];
}
C = new int[m+1];
CountingSort(A, B, m);
for(i=1 ; i<n ; i++){
    System.out.print(B[i]+" ");
}
System.out.println(B[i]);

}
  public static void CountingSort(int A[], int B[], int k){
        for(int i=0 ; i<k ; i++){
            C[i] = 0;
        }
        for(int j=1 ; j<=n ; j++){
            C[A[j]]++;
        }
        for(int i=1 ; i<=k ; i++){
            C[i] = C[i] + C[i-1];
        }
        for(int j=n ; j>0 ; j--){
            B[C[A[j]]] = A[j];
            C[A[j]]--;
        }
    }
}

