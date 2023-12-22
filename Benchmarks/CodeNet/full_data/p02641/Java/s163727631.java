import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        if(n == 0) {
            System.out.println(x);
            System.exit(0);
        }

        int[] p = new int[n];

        for(int i=0; i<n; i++) {
            p[i] = sc.nextInt();
        }

        ArrayList<Integer> ep = new ArrayList<>();
        for(int i=0; i<=101; i++) {
            boolean isFound = false;
            for(int j=0; j<p.length; j++) {
                if(i == p[j]) isFound = true;
            }
            if(!isFound) ep.add(i);
        }

        int diff = 0;
        int comp = 0;
        int ans = 0;
        for(int i=0; i<ep.size(); i++) {
            diff = Math.abs(x-ep.get(i));
            if(i == 0) comp = diff;
            if(comp > diff) {
                comp = diff;
                ans = ep.get(i);
            }
        }
        System.out.println(ans);
    }
}
