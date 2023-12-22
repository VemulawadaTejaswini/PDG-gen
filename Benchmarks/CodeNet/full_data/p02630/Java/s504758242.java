import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int MAX = 100000;
        Queue[] nums = new Queue[MAX];
        for(int i=0;i<MAX;i++) {
            nums[i]= new ArrayDeque<Integer>();
        }
        for(int i=0;i<N;i++) {
            int num = sc.nextInt()-1;
            nums[num].add(i);
        }

        int Q=sc.nextInt();
        int[] answers = new int[Q];
        for(int i=0;i<Q;i++) {
            int B=sc.nextInt()-1;
            int C=sc.nextInt()-1;
            while(!nums[B].isEmpty()) {
                nums[C].add(nums[B].poll());
            }
            int total=0;
            for(int j=0; j<MAX; j++) {
                for(int k=0; k<nums[j].size(); k++) {
                    total+=j+1;
                }
            }
            answers[i] = total;
        }
        for(int inside:answers) {
            System.out.println(inside);
        }
    }

}
