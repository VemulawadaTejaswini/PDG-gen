import java.util.*;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = (int) Math.floor(x / 100.0);
        boolean flg = false;
        for (int i5 = n; i5 >= 0; i5--) {
            int n5 = n - i5;
            int p5 = x - 105 * i5;
            if (n5 < 0 || p5 < 0) continue;
            for (int i4 = n5; i4 >= 0; i4--) {
                int n4 = n5 - i4;
                int p4 = p5 - 104 * i4;
                if (n4 < 0 || p4 < 0) continue;
                for (int i3 = n4; i3 >= 0; i3--) {
                    int n3 = n4 - i3;
                    int p3 = p4 - 103 * i3;
                    if (n3 < 0 || p3 < 0) continue;
                    for (int i2 = n3; i2 >= 0; i2--) {
                        int n2 = n3 - i2;
                        int p2 = p3 - 102 * i2;
                        if (n2 < 0 || p2 < 0) continue;
                        for (int i1 = n2; i1 >= 0; i1--) {
                            int n1 = n2 - i1;
                            int p1 = p2 - 101 * i1;
                            if (n1 < 0 || p1 < 0) continue;
                            for (int i0 = n1; i0 >= 0; i0--) {
                                int n0 = n1 - i0;
                                int p0 = p1 - 100 * i0;
                                if (n0==0 && p0==0) flg = true;
                            }
                        }
                    }
                }
            }
        }
        if (flg) System.out.println("1");
        else System.out.println("0");
    }
}