import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        char[] sa = s.toCharArray();
        String t = sc.next();
        char[] ta = t.toCharArray();

        int l = lcm(n, m);
        
        char[] x = new char[10000000];
        
        int rel = l;
        for (int num = l; num <= 1000000; num++){
            boolean flag = true;
            for (int i = 0; i < sa.length; i++) {
                if (i == 0) {
                    x[i] = sa[i];
                } else {
                    int j = i * (num/sa.length) + 1;
                    x[j] = sa[i];
                }
            }
            for (int i = 0; i < ta.length; i++) {
                if (i == 0) {
                    if (x[i] != ta[i]) {
                        rel = -1;
                        flag = false;
                        break;
                    } 
                } else {
                    int j = i * (num/ta.length) + 1;
                    char tt = x[j];
                    if (tt != '\u0000' && tt != ta[i]) {
                        rel = -1;
                        flag = false;
                        break;
                    }
                }
            }
            if (flag && num%n == 0 && num%m == 0) {
                rel = num;
                break;
            }
        }

        System.out.println(rel);
        sc.close();
    }

    static int lcm (int a, int b) {
        int temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (int)(c/b);
    }
}
