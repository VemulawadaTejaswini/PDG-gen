import java.util.*;

class Main {

    static void solve (int n, ArrayList<Integer> data) {
        ArrayList<Integer> max = new ArrayList<Integer>();
        max.add(data.get(0));
        for (int i = 1; i < n; i++) {
            if (max.get(i-1) > 0)   max.add(max.get(i-1) + data.get(i));
            else                    max.add(data.get(i));
        }

        System.out.println( Collections.max(max) );
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            
            int n = sc.nextInt();
            if (n == 0) break;

            ArrayList<Integer> data = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {
                data.add(sc.nextInt());      
            }

            solve(n, data);
        }

    }
}