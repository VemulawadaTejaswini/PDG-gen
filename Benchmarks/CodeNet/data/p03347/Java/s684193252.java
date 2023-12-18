import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N  = scan.nextInt();
        long[] A = new long[N];
        for(int i=0;i<N;++i)A[i]=scan.nextLong();
            long top=-1;
            long ans = 0;
            for(int i=0;i<N;++i){
                if(A[i]!=top+1){
                    if(A[i]>top+1){
                        System.out.println(-1);
                        return;
                    }
                    ans += top;
                }
                top=A[i];
            }
            System.out.println(ans + A[N-1]);
    }
}