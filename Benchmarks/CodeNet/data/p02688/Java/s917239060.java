import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<k; i++) {
            int d = sc.nextInt();
            for (int j=0; j<d; j++) {
                int tmp = sc.nextInt();
                set.add(tmp);
            }
        }

        System.out.println(n - set.size());
    }
}
