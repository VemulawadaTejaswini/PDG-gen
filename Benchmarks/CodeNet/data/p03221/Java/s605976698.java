import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    
    public static void main(String[] args) {
        int N = nint();
        int M = nint();
        
        List<City> cities = new ArrayList<>(1000000);
        for (int i = 1; i <= M; i++) {
            cities.add(new City(nint(), nint()));
        }
        
        Map<Integer, List<City>> map =
                cities.stream().collect(groupingBy(city -> city.pref));
        
        for (List<City> list : map.values()) {
            list.sort((c1, c2) -> c1.since - c2.since);
            
            for (int i = 1; i <= list.size(); i++) {
                list.get(i-1).no = i;
            }
        }
        
        for (City city: cities) {
            myPrint(city.pref);
            myPrint(city.no);
            System.out.println();
        }
    }
    static private void myPrint(int num) {
        for (int i = 0; i <= 5 - i/10; i++) {
            System.out.print(0);
        }
        System.out.print(num);
    }
    
    static class City {
        int pref;
        int since;
        int no;
        
        public City(int pref, int since) {
            this.pref = pref;
            this.since = since;
        }
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static int nint() {
        return sc.nextInt();
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static String[] nstrs(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = nstr();
        return a;
    }

    private static char[][] nsToChars2D(int h, int w) {
        return nsToChars2D(h, w, 0);
    }

    private static char[][] nsToChars2D(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nsToChars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
