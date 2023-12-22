import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long K = scan.nextLong();
        int P[]=new int[N];
        long C[]=new long[N];
        int kai[]=new int [N];
        long ten[]=new long[N];
        for(int i=0;i<N;i++){P[i]=scan.nextInt();}
        for(int i=0;i<N;i++){C[i]=scan.nextLong();}
        long m[]=new long[N];
        long le[]=new long[N];

        for(int i=0;i<N;i++){int j=P[i]-1;
            kai[i]=1;
            ten[i]=C[j];
            m[i]=C[j];
            le[i]=1;
            while(i!=j) {
                kai[i]++;
                j = P[j] - 1;
                ten[i] = ten[i] + C[j];
                if (m[i] < C[j]) {
                    m[i] = C[j];
                    le[i] = kai[i];
                }
            }
            }
long M[]=new long[N];
            for(int i=0;i<N;i++){
                M[i]=ten[i]*(long)((K-le[i])/kai[i])+m[i];
            }



        Arrays.sort(M);

System.out.println(M[N-1]);
    }
}
