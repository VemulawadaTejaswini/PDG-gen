import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long A;
        long[] aList;
        long[] xList;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            aList = new long[N];
            xList = new long[N];
            for(int i = 0; i < N;i++){
                aList[i] = sc.nextLong();
            }
        }
        long result = 0;
        int s = 1;
        for(int i = 0;i < N;i++){
            result += ((s) * aList[(N-i)-1]);
            s *= -1;
        }
        //result は N1
        //X <- (X1 - (A1)/2)*2
        xList[0] = result;
        for(int i = 1; i < N;i++){
            xList[i] = (aList[i-1] - (xList[i-1] / 2))*2;
        }
        StringBuilder sb = new StringBuilder();
        for(long i : xList){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }


}
