import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int Q = sc.nextInt();

        boolean isReversed = false;
        String headString = "";
        String tailString = "";
        String ans = S;
        for(int i=0;i<Q;i++){
            int t = sc.nextInt();
            if(t == 1){
                isReversed = !isReversed;

            } else {
                int f = sc.nextInt();
                String C = sc.next();
                if(f == 1){
                    if(isReversed){
                        ans = ans + C;
                    } else {
                        ans = C + ans;
                    }
                } else {
                    if(isReversed){
                        ans = C + ans;
                    } else {
                        ans = ans + C;
                    }
                }
            }

        }
        if(isReversed ){
            StringBuffer sb = new StringBuffer(ans);
            System.out.println(sb.reverse());
        } else {
            System.out.println(ans);
        }

    }

}







