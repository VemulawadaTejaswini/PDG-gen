import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long A = scan.nextLong();
        long B = scan.nextLong();

        if(A+B-1>N || A*B<N){
            System.out.println(-1);
            return;
        }

        List<Long> ansList = new ArrayList<>();
        long n=0,m=0,l=0;
        n = (N-A)/B;
        if(n + N-n*B == A){
            m=N-n*B;
        }else{
            m = A -n-1;
            l = N-n*B-m;
        }

        for(long i=0;i<n;++i){
            for(long j=B;j>0;--j)ansList.add(i*B+j);
        }
        for(long i=n*B+l;i>n*B;--i)ansList.add(i);
        for(long i=n*B+l+1;i<=N;++i)ansList.add(i);
        for(int i=0;i<N;++i)System.out.print(ansList.get(i)+(i==N-1 ? "\n":" "));
    }
}