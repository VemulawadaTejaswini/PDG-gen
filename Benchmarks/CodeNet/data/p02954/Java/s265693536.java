import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        List<Integer> list = new ArrayList<Integer>();
        int c = 1;
        for (int i = 0 ; i < n -1 ; i++) {
            if (s[i] == s[i + 1]) {
                c++;
            }else {
                list.add(c);
                c = 1;
            }
        }
        list.add(c);
        int[] a = new int[n];
        for (int i = 0 ; i < n - 1 ; i++) {
            if (s[i] == 'R' && s[i + 1] == 'L') {
                if (list.get(0) % 2 == 0) {
                    a[i] += list.get(0)/2;
                    a[i + 1] += list.get(0)/2;
                } else {
                    a[i] += list.get(0)/2 + 1;
                    a[i + 1] += list.get(0)/2;
                }
                if (list.get(1) % 2 == 0) {
                    a[i] += list.get(1)/2;
                    a[i + 1] += list.get(1)/2;
                } else {
                    a[i] += list.get(1)/2;
                    a[i + 1] += list.get(1)/2 + 1;
                }
                list.remove(0);
                list.remove(0);
            }
        }
        for (int i = 0 ; i < n ; i++) {
            System.out.print(a[i] + " ");
        }

    }

}