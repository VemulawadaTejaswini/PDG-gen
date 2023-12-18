import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        if(A+B>N+1 || A*B<N){
            System.out.println(-1);
            return;
        }
        List<Integer> ansList = new ArrayList<>();
        int n = N/B;
        int m = A-n-1;
        int l = N-m-n*B;
        if(l<=0 || m<0){
            --n;
            m=A-n-1;
            l=N-m-n*B;
        }else if(l>B){
            ++n;
            m=A-n-1;
            l=N-m-n*B;
        }

        for(int i=0;i<n;++i){
            for(int j=B;j>0;--j)ansList.add(i*B+j);
        }
        for(int i=n*B+l;i>n*B;--i)ansList.add(i);
        for(int i=n*B+l+1;i<=N;++i)ansList.add(i);
        for(int i : ansList)System.out.print(i+" ");
        System.out.println();
    }
}