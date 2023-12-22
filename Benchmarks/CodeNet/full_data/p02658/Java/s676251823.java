import java.math.BigInteger;
import java.util.*;
class Main{
    public static void main(String[] args) {
        long A[]=new long[100001];
        BigInteger B=BigInteger.ZERO;
        BigInteger max=BigInteger.ONE;
        max=max.multiply(BigInteger.valueOf(1000000000));
        max=max.multiply(BigInteger.valueOf(1000000000));
        Scanner sc=new Scanner(System.in);
        int n=0;
        n=sc.nextInt();

        for(int i=0;i<n;i++){
        A[i]=sc.nextLong();
            if(A[i]==0){
            System.out.print("0");
            System.exit(0);
            }
        }
    B=B.add(BigInteger.valueOf(A[0]));
    for(int i=1;i<n;i++){
    B=B.multiply(BigInteger.valueOf(A[i]));
    if(max.compareTo(B)>0){
        System.out.print("-1");
        System.exit(0);
    }
}   System.out.println(max);

    System.out.print(B);

    }
}