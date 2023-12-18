import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L=sc.nextInt();
        String[] A=new String[N];
        for(int i=0;i<N;i++){
            A[i]=sc.next();
        }
        Arrays.sort(A);
        for(int i=0;i<N;i++){
            System.out.print(A[i]);
        }
        System.out.println();
    }
}