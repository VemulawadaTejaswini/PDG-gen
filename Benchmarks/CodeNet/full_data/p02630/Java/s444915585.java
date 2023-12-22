
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
       int A[]=new int[N];
       for(int i=0;i<N;i++){A[i]=scan.nextInt(); }
       int Q=scan.nextInt();
int B[]=new int [Q];
        int C[]=new int [Q];
        int S[]=new int[Q];
        for(int i=0;i<Q;i++){B[i]=scan.nextInt();
        C[i]=scan.nextInt();}
        for(int j=0;j<Q;j++){
        for(int i=0;i<N;i++){if(A[i]==B[j]){A[i]=C[j];}
        S[j]=S[j]+A[i];

        }
        System.out.println(S[j]);}
    }
}
