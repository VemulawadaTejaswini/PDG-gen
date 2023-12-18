import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();
        int[] ans = new int[N];

        for(int i = 0; i < N; i++) {
            int gap = 1;
            if(S.charAt(i) == 'R'){
                while(S.charAt(i + gap) != 'L'){
                    gap++;
                }
                if(gap % 2 == 0) ans[i + gap]++;
                else ans[i + gap - 1]++;
            }else{
                while(S.charAt(i - gap) != 'R'){
                    gap++;
                }
                if(gap % 2 == 0) ans[i - gap]++;
                else ans[i - gap + 1]++;
            }
        }

        System.out.print(ans[0]);
        for(int i = 1; i < N; i++) {
            System.out.print(" ");
            System.out.print(ans[i]);
        }
    }

}