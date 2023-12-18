import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // long K = sc.nextLong();
        int[] A = new int[N];
        boolean[] bool = new boolean[N];
        boolean res = true;
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(sc.next());
            if(A[i] % 2 != 0){
                System.out.println(0);
                System.exit(0);
            }
        }
        int count = 0;
        boolean t = true;
        
        while(t){
            for(int i=0; i<N; i++){
                if(i == 0){
                    count += 1;
                }
                A[i] = A[i] / 2;
                if(A[i] % 2 != 0 ){
                    res = false;
                    break;
                }
            } 
            if(!res){
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}      