import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long res = 0;
        boolean[] seen = new boolean[n];
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(sc.next())-1;
        }
        int next = A[0];
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int idx = -1;
        seen[0] = true;
        while(true) {
            if(seen[next]) {
                idx = next;
                break;
            }
            seen[next] = true;
            list.add(next);
            next = A[next];
        }
        List<Integer> li = new ArrayList<>();
        int c = 0;
        if(idx != -1) {
            for(int i = 0; i < list.size(); i++) {
                if(list.get(i) != idx) {
                    li.add(list.get(i));
                    list.remove(i);
                    i--;
                    c++;
                } else {
                    break;
                }
            }
        }
        if(k < c) {
            res = li.get((int)k) + 1;
        } else {
            res = list.get((int)((k-c) % list.size()))+ 1;
        }
        System.out.println(res);
    }
}
