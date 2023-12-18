import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int slength = s.length();
        char[] c = s.toCharArray();
        int[] cInt = new int[s.length()];
        for (int i=0;i<s.length();i++) {
            cInt[i] = Character.getNumericValue(c[i]);
        }
        int ans = 0;
        for (int i=0;i<=(slength-4);i++) {
                int total=0;
                for (int k=i;k<slength;k++) {
                    total*=10;
                    total+=cInt[k];
                    total%=2019;
                    if (total==0) {
                        ans++;
                    }
                }
        }
        System.out.println(ans);
    }
}
