import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();

        int rNum = 0;
        for (int i = 0; i < N; i++) {
            if(s.charAt(i) == 'R'){
                rNum++;
            }
        }

        if(rNum > N - rNum){
            out.println("Yes");
        } else {
            out.println("No");
        }
    }
}