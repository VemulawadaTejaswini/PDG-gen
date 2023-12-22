import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> kudamono = new ArrayList<>();
        for (int i=1;i<=n;i++) {
            kudamono.add(sc.nextInt());
        }

        int ans=0;
        Collections.sort(kudamono);
        for (int i=0;i<k;i++) {
            ans += kudamono.get(i);
        }
        System.out.println(ans);
    }
}
