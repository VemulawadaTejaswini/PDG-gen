import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        String s = sc.next();

        int[] m = new int[N + 2];

        for(int i=1; i<=N; i++) {
            m[i] = 1;
        }

        for(int i=0; i<Q; i++) {
            String t = sc.next();
            String d = sc.next();

            for(int j=0; j<N; j++) {
                if(s.charAt(j) == t.charAt(0)) {
                    int index = j + 1;
                    switch(d) {
                        case "L":
                            m[index-1]+= m[index];
                            break;
                        case "R":
                            m[index+1]+= m[index];
                            break;
                    }
                    m[index] = 0;
                }
            }
        }

        int ans = 0;
        for(int i=1; i<=N; i++) {
            ans += m[i];
        }

        System.out.println(ans);
    }
}