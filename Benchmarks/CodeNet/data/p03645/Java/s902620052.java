import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a, b;
        List<Integer> adj1 = new ArrayList<>();
        List<Integer> adjN = new ArrayList<>();
        for (int i=0; i<m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a==1) {
                if (adjN.contains(b)) {System.out.println("POSSIBLE"); return;}
                adj1.add(b);
            }
            if (b==n) {
                if (adj1.contains(a)) {System.out.println("POSSIBLE"); return;}
                adjN.add(a);
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
