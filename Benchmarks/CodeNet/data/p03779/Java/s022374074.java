import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int mini = x;
        for(int i = 1; i<=x && i<=mini; i++) {
            int xc = x;
            int ic = i;
            while(xc >= ic && ic<mini) {
                if(xc-ic >= ic+1) {
                    xc = xc-ic;
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