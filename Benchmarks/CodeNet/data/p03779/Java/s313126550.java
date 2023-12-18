import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int mini = Integer.MAX_VALUE;
        for(int i = 1; i<=x; i++) {
            int xc = x;
            int ic = i;
            int cnt = 0;
            while(xc >= ic) {
                if(xc-ic >= ic+1) {
                    xc = xc-ic;
                    cnt++;
                }
                if(xc-ic==0) {
                    mini = Math.min(mini, ic);
                    break;
                }
                ic++;
            }
        }
        System.out.println(mini);

    }
}