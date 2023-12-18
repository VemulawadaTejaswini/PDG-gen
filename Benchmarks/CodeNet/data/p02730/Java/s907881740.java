import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.next().split("");
        int N = S.length;
        String ret = "Yes";
        for (int i = 0; i < N/2; i++) {
            if (!S[i].equals(S[N - i - 1])) {
                ret = "No";
                break;
            }
        }
      	for (int i = 0; i < N/4; i++) {
          if (!S[i].equals(S[N/2 -i -1])) {
            ret = "No";
            break;
          }
        }
        System.out.println(ret);
    }
}