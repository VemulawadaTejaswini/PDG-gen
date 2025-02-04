import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int MAX = 100000;
        int[] counter = new int[MAX];
        int total=0;
        for(int i=0;i<N;i++) {
            int num = sc.nextInt()-1;
            counter[num]++;
            total+=num+1;
        }

        int Q=sc.nextInt();
        int[] answers = new int[Q];
        for(int i=0;i<Q;i++) {
            int B=sc.nextInt()-1;
            int C=sc.nextInt()-1;
            total+=(C-B)*counter[B];
            answers[i] = total;
            counter[C] += counter[B];
            counter[B]=0;
        }
        for(int inside:answers) {
            System.out.println(inside);
        }
    }

}
