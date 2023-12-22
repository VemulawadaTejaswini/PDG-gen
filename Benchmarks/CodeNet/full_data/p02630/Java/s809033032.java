import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int MAX = 100001;
        int[] counter = new int[MAX];
        long total=0;
        for(int i=0;i<N;i++) {
            int num = sc.nextInt();
            counter[num]++;
            total+=num;
        }

        int Q=sc.nextInt();
        long[] answers = new long[Q];
        for(int i=0;i<Q;i++) {
            int B=sc.nextInt();
            int C=sc.nextInt();
            total+=(C-B)*counter[B];
            answers[i] = total;
            counter[C] += counter[B];
            counter[B]=0;
        }
        for(long inside:answers) {
            System.out.println(inside);
        }
    }
}