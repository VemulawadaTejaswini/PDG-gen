import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] S = new char[N];
        S = sc.next().toCharArray();

        int firstEmerge = N;
        for (int i=0; i<N; i++) {
          	firstEmerge = i;
            if (S[i] == '#') break;
        }

        int lastEmerge = 0;
        for (int i=N-1; i>=0; i--) {
          	lastEmerge = i;
            if (S[i] == '.') break;
        }

        int countSharp = 0;
        int countDot = 0;
        for (int i=firstEmerge; i<lastEmerge+1; i++) {
            if (S[i] == '#') countSharp++;
            if (S[i] == '.') countDot++;
        }
        System.out.println(Math.min(countSharp, countDot));
    }
}