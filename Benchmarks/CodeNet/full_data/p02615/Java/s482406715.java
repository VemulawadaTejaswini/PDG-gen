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
        sum+=p*A[A.length-2];
        System.out.println(sum);
    }
}