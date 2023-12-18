import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        boolean[] s = new boolean[n];

        for(int i = 0; i < n; i++){
            s[i] = str.charAt(i) == 'o';
        }

        next:
        for(int i = 0; i < 4; i++){
            boolean[] t = new boolean[n];
            switch(i){
                case 0:
                    t[0] = true;
                    t[1] = true;
                    break;
                case 1:
                    t[0] = true;
                    t[1] = false;
                    break;
                case 2:
                    t[0] = false;
                    t[1] = true;
                    break;
                case 3:
                    t[0] = false;
                    t[1] = false;
                    break;
            }

            for(int j = 2; j < n; j++){
                t[j] = (t[j - 1] == s[j - 1]) == t[j - 2];
            }

            StringBuilder sb = new StringBuilder();
            
            if((s[0] == t[0]) != (t[n - 1] == t[1])){
                continue next;
            }
            sb.append(t[0] ? "S" : "W");
            for(int j = 1; j < n - 1; j++){
                if((s[j] == t[j]) != (t[j - 1] == t[j + 1])){
                    continue next;
                }
                sb.append(t[j] ? "S" : "W");
            }
            if((s[n - 1] == t[n - 1]) != (t[n - 2] == t[0])){
                continue next;
            }
            sb.append(t[n -1] ? "S" : "W");
            
            System.out.println(sb.toString());
            return;
        }
        System.out.println(-1);

    }
}
