import java.util.*;
import java.lang.*;

class Main{
    Main(){
        Scanner SC = new Scanner(System.in);
        StringBuffer SB = new StringBuffer(SC.next());

        int Q = Integer.parseInt(SC.next());

        boolean isReverse = false;
        for(int i=0;i<Q;i++){
            int T = Integer.parseInt(SC.next());
            if(T==1){
                isReverse = !isReverse;
            } else {
                int F = Integer.parseInt(SC.next());
                char C = SC.next().charAt(0);

                if(F == 1){
                    if(isReverse){
                        SB.insert(SB.length(), C);
                    } else {
                        SB.insert(0, C);
                    }
                } else {
                    if(isReverse){
                        SB.insert(0, C);
                    } else {
                        SB.insert(SB.length(), C);
                    }
                }
            }
        }
        
        if(isReverse) SB.reverse();

        System.out.println(SB.toString());
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
