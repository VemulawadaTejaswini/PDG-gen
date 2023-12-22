import java.util.Scanner;

public class Princess {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while(sc.hasNext()) {
                int N=sc.nextInt();
                int M=sc.nextInt();
                if(N+M==0)    break;
                int[] ds = new int[11];
                for(int i=0; i<N; i++) {
                    int d = sc.nextInt();
                    int p = sc.nextInt();
                    ds[p] += d;
                }
                int P = 0;
                for(int p= 10; p >=0; p--) {
                    if(M >= ds[p]) {
                        M -= ds[p];
                    }
                    else {
                        P += (ds[p] - M) * p;
                        M = 0;
                    }
                }
                System.out.println(P);
            }
        }
    }
}
