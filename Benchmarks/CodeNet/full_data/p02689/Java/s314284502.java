import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int[] h = new int[H+1];
        List<List<Integer>> m = new ArrayList<>();
        int count = 0;
        for(int i=1; i<=H; i++) {
            h[i] = sc.nextInt();
        }
        for(int i=0; i<M; i++) {
            List<Integer> m1 = new ArrayList<>();
            m1.add(sc.nextInt());
            m1.add(sc.nextInt());
            m.add(m1);
        }
        for(int i=1; i<=H; i++) {
            boolean x = true;
            for(int j=0; j<M; j++) {
                if(m.get(j).contains(Integer.valueOf(i))) {
                    if(m.get(j).get(0) != i) {
                        if(h[i] <= h[m.get(j).get(0)]) {
                            x = false;
                            break;
                        }
                    } else if(m.get(j).get(1) != i) {
                        if(h[i] <= h[m.get(j).get(1)]) {
                            x = false;
                            break;
                        }
                    }
                }
            }
            if(x == true) count++;
        }
        System.out.println(count);
    }
}