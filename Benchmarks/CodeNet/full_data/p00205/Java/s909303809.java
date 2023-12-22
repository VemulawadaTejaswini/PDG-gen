import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int[] l = new int[5];
            boolean[] t = new boolean[3];
            l[0] = sc.nextInt()-1;
            if (l[0] == -1) {
                break;
            }
            t[l[0]] = true;
            for (int i = 1; i < 5; i++) {
                l[i] = sc.nextInt()-1;
                t[l[i]] = true;
            }
            for (int i = 0; i < 5; i++) {
                if (t[0] ^ t[1] ^ t[2]) {
                    System.out.println(3);
                } else {
                    for(int j=0;j<3;j++) {
                        if(l[i]!=j&&t[l[i]]==t[j]) {
                           System.out.println((l[i]-j+3)%3==2?1:2);
                           break;
                        }
                    }
                }
            }
        }
    }
}
