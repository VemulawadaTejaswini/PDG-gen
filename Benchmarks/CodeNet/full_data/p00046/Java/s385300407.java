import java.util.*;

class Main {

    static ArrayList<Double> mountains;

    static void solve () {
        System.out.println( Collections.max(mountains) - Collections.min(mountains) );
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        
        mountains = new ArrayList<Double>();

        while(sc.hasNext()) {
            mountains.add(sc.nextDouble());
        }
        
        solve();
    }
}