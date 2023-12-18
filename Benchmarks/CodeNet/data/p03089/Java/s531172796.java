import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solver{

    private final int N;
    private final int[] B;

    Solver(Scanner in){
        N = in.nextInt();
        B = new int[N];
        for(int i = 0; i < B.length; i++){
            B[i] = in.nextInt();
        }
    }

    void solve(){
        int[] result = new int[N];
        for(int i = result.length - 1; i >= 0; i--){
            int max = -1;
            int idx = 0;
            int mi = B.length;
            for(int j = 0; j < B.length; j++){
                int b = B[j];
                if(b < 0)continue;
                if(b - 1 != idx++) continue;
                mi = j;
                max = b;
            }
            if(max < 0) {
                System.out.println(-1);
                return;
            }
            if(mi < B.length) B[mi] = -1;
            result[i] = max;
        }
        System.out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining("\n")));
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}