
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s[] = new String[N];
        int t[] = new int[N];
        for(int i=0;i<N;i++){
            s[i] = sc.next();
            t[i] = sc.nextInt();
        }
        String X = sc.next();
        long result = 0;
        boolean flag = false;

        for(int i=0;i<N;i++) {
            if (flag) {
                result += t[i];
            }else if(s[i].equals(X)){
                flag = true;
            }
        }

        System.out.println(result);
    }
}
