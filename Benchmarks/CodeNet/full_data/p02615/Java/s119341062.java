import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        for(int i=0;i<A.length;++i)
            A[i]=sc.nextInt();
        Arrays.sort(A);
        long sum=A[A.length-1];
        int p=A.length-2;
//        sum+=p*A[A.length-2];
//        for(int i=A.length-1;i>0;--i) {
//            sum+=A[i];
//        }
        int i=A.length-3;
        for(int j=p;i>=0&&j>1;--i,j-=2) {
            sum+=2*A[i];
        }
        if(p>0&&p%2==1) {
            sum+=A[i];
        }
        System.out.println(sum);
    }
}