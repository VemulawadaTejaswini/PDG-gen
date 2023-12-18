import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];

        for(int i=0;i<N;i++){
            A[i] = scanner.nextLong();
        }

        Arrays.sort(A);

        for(int i=1;i<N;i++){
            if(A[i] == A[i-1]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
