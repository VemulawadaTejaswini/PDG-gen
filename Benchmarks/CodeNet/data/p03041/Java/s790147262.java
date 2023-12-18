import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        int n = inp.nextInt();
        int k = inp.nextInt();
        k -= 1;
        String s = inp.next();
        String s1 = s.substring(0, k);
        String s2 = Character.toString(s.charAt(k));
        String s3 = s.substring(k + 1, n);
        System.out.println(s1 + s2.toLowerCase() + s3);
    }
}
