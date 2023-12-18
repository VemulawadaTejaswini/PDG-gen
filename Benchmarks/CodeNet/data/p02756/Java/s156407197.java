import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = new char[1000000];
        int l = 500000;
        int r = 500000;
        char[] s = sc.next().toCharArray();

        for(int i=0;i<s.length;i++){
            str[r]=s[i];
            r=500000+i;
        }
        int q = sc.nextInt();

        for(int i=0;i<q;i++) {
            int t = sc.nextInt();
            if (t == 1) {
                char temp = str[l];
                str[l] = str[r];
                str[r] = temp;
            } else {
                int f = sc.nextInt();
                char c = sc.next().charAt(0);
                if (f == 1) {
                    l--;
                    str[l] = c;
                } else {
                    r++;
                    str[r] = c;
                }
            }
        }

        for(int i=l;i<r+1;i++){
            System.out.print(str[i]);
        }
        System.out.println();


    }
}


