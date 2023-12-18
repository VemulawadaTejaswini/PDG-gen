import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        char[] s1 = inp.next().toCharArray();
        char[] s2 = inp.next().toCharArray();
        char[] s3 = inp.next().toCharArray();
        System.out.println(s1[0] + "" + s2[1] + "" + s3[2]);
        inp.close();
    }
}
