import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        char[][] a = new char[h][w];
        char[][] b = new char[w][h];

        for(int i=0; i<h; i++) {
            String s = sc.next();
            for(int j=0; j<w; j++) {
                a[i][j] = b[j][i] = s.charAt(j);
            }
        }

        String[] as = new String[h];
        String[] bs = new String[w];

        for(int i=0; i<h; i++) {
            as[i] = new String(a[i]);
        }
        for(int j=0; j<w; j++) {
            bs[j] = new String(b[j]);
        }
        if(isValid(h, as) && isValid(w, bs)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isValid(int n, String[] a) {
        for(int i=0; i<n; i++) {
            a[i] = sort(a[i]);
        }
        boolean second = false;

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        int odd = 0;
        for(String key : map.keySet()) {
            if(map.get(key) %2 == 1) {
                odd ++;
            }
        }

        return odd <= 1;
    }

    private static String sort(String a) {
        char[] c = a.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

}
