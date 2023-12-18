import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();
        int P = sc.nextInt();
        int count=0;
        int ans;

        List<Integer> A = new ArrayList<>(N);
        for(int i=0; i < N; i++){
            A.add(sc.nextInt());
        }

        Collections.sort(A);
        Collections.reverse(A);

        List<Integer> low = A.subList(P, A.size());
        List<Integer> high = A.subList(0, P);
        int minOfHigh = A.get(P);

        for(int i: low){
            if((minOfHigh - i) > M){
                count++;
            }
        }

        ans = A.size() - count;
        System.out.println(ans);

        
    }
}
