import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] L = new int[n];
        int res = 0;
        Arrays.fill(L, 1);
        int idxw = 0;
        int[] wrt = new int[n];
        boolean flag = false;
        for(int i = 0; i < m; i++) {
            int x = Integer.parseInt(sc.next())-1, y = Integer.parseInt(sc.next())-1;
            if(idxw == x) {
                flag = true;
                idxw = y;
                wrt[y]++;
            }
            L[x]--;
            L[y]++;
        }
        if(!flag) wrt[0]++;
        for(int i = 0; i < n; i++) {
            if(wrt[i] != 0 && L[i] != 0) res++;
        }
        System.out.println(res);
    }
}
