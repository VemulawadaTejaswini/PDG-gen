import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public int getHlast(char[] S) {
        int hlast = S.length - 1;
        for (int i = hlast; i >= 0; i--) {
            if (S[i] == 'W' || S[i] == 'E') {
                return i;
            }
        }
        return 0;
    }

    public int getVlast(char[] S) {
        int vlast = S.length - 1;
        for (int i = vlast; i >= 0; i--) {
            if (S[i] == 'N' || S[i] == 'S') {
                return i;
            }
        }
        return 0;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        int N = S.length;

        int hlast = getHlast(S);
        int vlast = getVlast(S);

        int[] a = new int[2];
        for (int i = 0; i < N; i++) {
            char ch = S[i];
            switch (ch) {
                case 'N':
                    if (a[0] < 0 && i == vlast) a[0]=0;
                    else a[0] = 1;
                    break;
                case 'S':
                    if (a[0] > 0 && i == vlast) a[0]=0;
                    else a[0] = -1;
                    break;
                case 'W':
                    if (a[1] < 0 && i == hlast) a[1]=0;
                    else a[1] = 1;
                    break;
                case 'E':
                    if (a[1] > 0 && i == hlast) a[1]=0;
                    else a[1] = -1;
                    break;
            }
        }
        
        if (a[0] == 0 && a[1] == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        return;
    }

}
