import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int Q = sc.nextInt();

        int reverseCount = 0;
        String headString = "";
        String tailString = "";
        String ans = S;
        for(int i=0;i<Q;i++){
            int t = sc.nextInt();
            if(t == 1){
                StringBuffer sb = new StringBuffer(ans);
                ans = sb.reverse().toString();

            } else {
                int f = sc.nextInt();
                String C = sc.next();
                if(f == 1){
                    ans = C + ans;
                } else {
                    ans = ans + C;
                }
            }

        }
        System.out.println(ans);

    }

}







