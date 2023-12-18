import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n / 2];
        int b[] = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        List<Integer> lista = new ArrayList<Integer>();
        List<Integer> listac = new ArrayList<Integer>();
        List<Integer> listb = new ArrayList<Integer>();
        List<Integer> listbc = new ArrayList<Integer>();

        lista.add(0);
        listac.add(0);
        listb.add(0);
        listbc.add(0);

        int count = 1;
        for (int i = 0; i < n / 2 - 1; i++) {
            if (a[i] != a[i + 1]) {
                lista.add(a[i]);
                listac.add(count);
                count = 1;
            } else {
                count++;
            }
        }
        lista.add(a[n / 2 - 1]);
        listac.add(count);

        count = 1;
        for (int i = 0; i < n / 2 - 1; i++) {
            if (b[i] != b[i + 1]) {
                listb.add(b[i]);
                listbc.add(count);
                count = 1;
            } else {
                count++;
            }
        }
        listb.add(b[n / 2 - 1]);
        listbc.add(count);

        int maxai = 0;
        int maxac = 0;
        for (int i = 0; i < listac.size(); i++) {
            if (listac.get(i) > maxac) {
                maxai = i;
                maxac = listac.get(i);
            }
        }
        int maxa = lista.get(maxai);
        lista.remove(maxai);
        listac.remove(maxai);
        int saxai = 0;
        int saxac = 0;
        for (int i = 0; i < listac.size(); i++) {
            if (listac.get(i) > saxac) {
                saxai = i;
                saxac = listac.get(i);
            }
        }
        int saxa = lista.get(saxai);

        int maxbi = 0;
        int maxbc = 0;
        for (int i = 0; i < listbc.size(); i++) {
            if (listbc.get(i) > maxbc) {
                maxbi = i;
                maxbc = listbc.get(i);
            }
        }
        int maxb = listb.get(maxbi);
        listb.remove(maxbi);
        listbc.remove(maxbi);
        int saxbi = 0;
        int saxbc = 0;
        for (int i = 0; i < listbc.size(); i++) {
            if (listbc.get(i) > saxbc) {
                saxbi = i;
                saxbc = listbc.get(i);
            }
        }
        int saxb = listb.get(saxbi);
        if (maxa != maxb) {
            System.out.println(n - maxac - maxbc);
        } else {
            System.out.println(Math.max(n - saxac - maxbc, n - maxac - saxbc));
        }
    }
}