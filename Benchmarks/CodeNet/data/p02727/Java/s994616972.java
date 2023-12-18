import java.util.*;

class Main{

    Main(){
        Scanner SC = new Scanner(System.in);

        int X = Integer.parseInt(SC.next());
        int Y = Integer.parseInt(SC.next());
        int A = Integer.parseInt(SC.next());
        int B = Integer.parseInt(SC.next());
        int C = Integer.parseInt(SC.next());

        TreeMap<Integer, Integer> P, Q, R;
        P = new TreeMap<>();
        Q = new TreeMap<>();
        R = new TreeMap<>();

        for (int i = 0; i < A; i++) {
            int IN = Integer.parseInt(SC.next());
            P.put(IN, P.getOrDefault(IN ,0)+1);
        }
        for (int i = 0; i < B; i++) {
            int IN = Integer.parseInt(SC.next());
            Q.put(IN, Q.getOrDefault(IN ,0)+1);
        }
        for (int i = 0; i < C; i++) {
            int IN = Integer.parseInt(SC.next());
            R.put(IN, R.getOrDefault(IN ,0)+1);
        }

        long Ans = 0L;
        int limitN = X+Y;
        int pMax, qMax, rMax;
        while (limitN > 0){
            if (X != 0){
                pMax = P.lastKey();
            } else {
                pMax = 0;
            }
            if (Y != 0){
                qMax = Q.lastKey();
            } else {
                qMax = 0;
            }
            if (!R.isEmpty()){
                rMax = R.lastKey();
            } else {
                rMax = 0;
            }

            if (rMax >= pMax && rMax >= qMax){
                Ans += rMax;

                if (R.get(rMax) != 1){
                    R.put(rMax, R.get(rMax)-1);
                } else {
                    R.remove(rMax);
                }
            } else if (pMax > qMax){
                Ans += pMax;
                X -= 1;

                if (P.get(pMax) != 1){
                    P.put(pMax, P.get(pMax)-1);
                } else {
                    P.remove(pMax);
                }
            } else {
                Ans += qMax;
                Y -= 1;

                if (Q.get(qMax) != 1){
                    Q.put(qMax, Q.get(qMax)-1);
                } else {
                    Q.remove(qMax);
                }
            }

            limitN -= 1;
        }

        System.out.println(Ans);
    }

    public static void main(String[] args){
        new Main();
    }
}
