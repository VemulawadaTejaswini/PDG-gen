import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static class pair {
            public int a;
            public int b;

            pair(){
                this.a = 0;
                this.b = 0;
            }

            pair(int a, int b){
                this.a = a;
                this.b = b;
            }

            public void set(int a, int b) {
                this.a = a;
                this.b = b;
            }
        }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] map = new long[5];

        for (int i = 0; i < N; i++) {
            String s = scanner.next();

            if(s.charAt(0) == 'M')map[0]++;
            if(s.charAt(0) == 'A')map[1]++;
            if(s.charAt(0) == 'R')map[2]++;
            if(s.charAt(0) == 'C')map[3]++;
            if(s.charAt(0) == 'H')map[4]++;
        }

        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += map[i] * map[j] * map[k];
                }
            }
        }

        System.out.println(ans);
    }



}


