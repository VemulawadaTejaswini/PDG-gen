

    import java.util.*;
    import java.io.*;
    class Program{
     
    }
    class Main{
        public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), count = 0,M = sc.nextInt(), C = sc.nextInt(),sum = C;
        int B[] = new int[M], A[] = new int[M];
        //System.out.println(N+" "+M+" "+C);
        for(int i = 0;i < M; i++) B[i] = sc.nextInt();
        for(int m = 0;m<N;m++){
            for(int i = 0; i<M;i++)A[i] = sc.nextInt();
            sum = C;
            for(int i = 0; i<M;i++)sum+=A[i]*B[i];
            if (sum>0) count++;
            }
        System.out.println(count);
        }
    }