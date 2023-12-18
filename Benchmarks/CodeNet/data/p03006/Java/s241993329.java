import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void debug(String str){
        boolean debug = false;
        if(debug != true){
            return;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {

        int n;
        Main.Boll[] bollArray = null;
        HashMap<String, Integer> hash = new HashMap<>(100);
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            bollArray = new Boll[n];
            Main main = new Main();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                Main.Boll boll = main.new Boll(x, y);
                bollArray[i] = boll;
            }
        }

        for(Main.Boll boll :bollArray){
            for(Main.Boll target:bollArray){
                if(boll ==  target|| target.cheaked ==true){
                    continue;
                }
                long deltaX = delta(target.x , boll.x);
                long deltaY = delta(target.y , boll.y);
                String temp = deltaX +":" + deltaY;
                debug(temp);
                Integer sum = hash.get(temp);
                if(sum != null){
                    hash.put(temp,sum +1);
                }else{
                    hash.put(temp,1);
                }
            }
            boll.cheaked = true;
        }
        int max = 0;
        for(Integer t : hash.values()){
            debug(t.toString());
            if(max < t.intValue()){
                max = t.intValue();
            }
        }
        debug("答え");
        System.out.println( n - max);

    }

    public static long delta(long x1,long x2){
        if(x1 > x2){
            return x1 - x2;
        }
        return x2 -x1;

    }
    class Boll {
        long x;
        long y;
        boolean cheaked = false;
        Boll(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void isChecked(){
            this.cheaked = true;
        }
    }
}
