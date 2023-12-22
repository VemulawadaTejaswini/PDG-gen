import java.util.Arrays;
import java.util.Scanner;

class BM {
    String pat;
    int[] rightMostIndex;
    final static int R = 256;

    public BM(String pat) {
        this.pat = pat;
        rightMostIndex = new int[R];

        Arrays.fill(rightMostIndex, -1);
        for (int i = 0; i < pat.length(); i++) {
            rightMostIndex[pat.charAt(i)] = i;
        }
    }

    public void search(String T) {
        int skip = 0;
        for (int i = 0; i < T.length()-this.pat.length()+1; i += skip) {
            skip = 0;
            for (int j = this.pat.length() - 1; j >= 0; j--) {
                if (T.charAt(i + j) != this.pat.charAt(j)) {
                    skip = Math.max(j - rightMostIndex[T.charAt(i + j)], 1);
                    break;
                }
            }
            if (skip == 0) {
                System.out.println(i);
                skip = 1;
            }
        }

    }
}

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String T = in.nextLine();
        String P = in.nextLine();

        BM bm = new BM(P);

        bm.search(T);
    }
}
