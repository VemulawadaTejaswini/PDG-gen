import java.util.*;
 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        int[] a = new int[c.length];
        for (int i = 0; i < c.length; i++){
            a[i] = (c[i] + n) % 91;
            if (a[i] <65){
                a[i] += 65;
            }
        }
        for (int i = 0; i < c.length; i++){
            c[i] = (char)a[i];
        }
        String ss = new String(c);
        System.out.println(ss);
    }
}
