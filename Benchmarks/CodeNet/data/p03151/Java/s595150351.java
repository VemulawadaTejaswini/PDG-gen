import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int B[] = new int[N];
        long sum_of_A = 0, sum_of_B = 0;
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            sum_of_A+=A[i];
        }
        for(int i=0; i<N; i++) {
            B[i] = sc.nextInt();
            sum_of_B+=B[i];
        }
        if(sum_of_A < sum_of_B) {
            System.out.println("-1");
            return;
        }
        long sum_of_lack=0;
        int lack_count=0;
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<N; i++) {
//            System.out.println(String.format("%d, %d", A[i], B[i]));
            if(A[i] == B[i]) continue;
            if(A[i] < B[i]) {
                sum_of_lack += B[i] - A[i];
                lack_count++;
            } else {
                li.add(A[i] - B[i]);
            }
        }
        li.sort((a,b)->b-a);
        long add_sum = 0;
//      System.out.println(String.format("size() is %d", li.size()));
        for(int k=0; k<li.size(); k++) {
//            System.out.println(String.format("add_sum:%d", add_sum));
            if(add_sum >= sum_of_lack) {
                System.out.println(lack_count + k);
                return;
            }
            add_sum += li.get(k);
        }
        System.out.println(lack_count + li.size());
    }
}
