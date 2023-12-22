import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        Collections.sort(A);

        long ans = 0;
        ans += A.get(A.size()-1);
        int j = A.size()-2;
        for (int i = 0; i < N-2; i++) {
            ans += A.get(j-i/2);
            //System.out.println("# "+A.get(j-i/2)+","+(j-i/2));
        }

        System.out.println(ans);
    }
}
