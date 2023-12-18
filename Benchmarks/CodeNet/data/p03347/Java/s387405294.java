import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N  = scan.nextInt();
        long[] A = new long[N];
        for(int i=0;i<N;++i)A[i]=scan.nextLong();
            long top=0;
            long ans = 0;
            for(int i=0;i<N;++i){
                if(A[i]!=top+1)ans += top;
                top=A[i];
                if(A[i]>i){
                    System.out.println(-1);
                    return;
                }
            }
            System.out.println(ans + A[N-1]);
    }
}