import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[] H;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            H = new long[N];
            for(int i=0;i < N ;i++){
                H[i] = sc.nextLong();
            }
        }
        long result = 0;
        long currentMax =0;
        for(int i=0;i < N -1;i++){
            if(H[i] >= H[i+1]){
                currentMax++;
            }else{
                if(currentMax > result){
                    result = currentMax;
                }
                currentMax = 0;
            }
        }
        if(currentMax > result){
            result = currentMax;
        }

        System.out.println( result);
    }

}
