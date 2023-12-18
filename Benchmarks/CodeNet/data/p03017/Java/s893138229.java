import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String s = sc.next();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.toCharArray()[i] == '#')
                set.add(i + 1);
        }
        System.out.println(search(a, b, c, d, set) ? "Yes" : "No");
    }

    public static boolean search(int aposi, int bposi, int adist, int bdist, Set<Integer> iwa) {
        if (iwa.contains(aposi) || aposi == bposi || adist < aposi) {
            return false;
        }
        if (iwa.contains(bposi) || aposi == bposi || bdist < bposi) {
            return false;
        }
        if (aposi == adist && bposi == bdist) {
            return true;
        }

        int acomp = 2;
        if (1 == adist - aposi || aposi + 2 == bposi || iwa.contains(aposi + 2)) {
            acomp = 1;
        }

        int bcomp = 2;
        if (1 == bdist - bposi || aposi == bposi + 2 || iwa.contains(bposi + 2))
            bcomp = 1;

        boolean a2 = search(aposi + acomp, bposi, adist, bdist, iwa);
        boolean b2 = search(aposi, bposi + bcomp, adist, bdist, iwa);

        return a2 || b2 ? true : false;
    }

    //    public static boolean search(int aposi, int bposi, int adist, int bdist, Set<Integer> iwa) {
    //        if (iwa.contains(aposi) || aposi == bposi || adist < aposi) {
    //            return false;
    //        }
    //        if (iwa.contains(bposi) || aposi == bposi || bdist < bposi) {
    //            return false;
    //        }
    //        if (aposi == adist && bposi == bdist) {
    //            return true;
    //        }
    //        boolean a1 = search(aposi+1, bposi, adist, bdist, iwa);
    //        boolean a2 = search(aposi+2, bposi, adist, bdist, iwa);
    //        boolean b1 = search(aposi, bposi+1, adist, bdist, iwa);
    //        boolean b2 = search(aposi, bposi+2, adist, bdist, iwa);
    //
    //        return a1 || a2 || b1 || b2 ? true : false;
    //    }
}