
import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int N=scan.nextInt();
int  A[]=new int [N] ;
int  B[]=new int [N];
int maxA=0;
        int maxB=0;
        int minA=0;
        int minB=0;

for(int i=0;i<N;i++){
    A[i]=scan.nextInt();
    B[i]=scan.nextInt();
    if(maxA<A[i]){maxA=A[i];}
    if(minA>A[i]){minA=A[i];}
    if(maxB<B[i]){maxB=B[i];}
    if(minB>B[i]){minB=B[i];}

}
int M=0;
int MA1=0;
int MB1=0;

        int MA2=0;
        int MB2=0;

for(int i=0;i<N;i++){if(((MA1<A[i]&&MA2>A[i])||(MA1>A[i]&&MA2<A[i]))&&((MB1<B[i]&&MB2>B[i])||(MB1>B[i]&&MB2<B[i]))){}
else{ if(Math.max(Math.abs(minA-A[i]),Math.abs(maxA-A[i]))+Math.max(Math.abs(minB-B[i]),Math.abs(maxB-B[i]))>M){   for(int j=i;j<N;j++){
        if(M<Math.abs(A[i]-A[j])+Math.abs(B[i]-B[j])){M=Math.abs(A[i]-A[j])+Math.abs(B[i]-B[j]);
        MA1=A[i];
            MA2=A[j];
            MB1=B[i];
            MB2=B[j];

        }

    }}}

}
System.out.println(M);

    }
}

