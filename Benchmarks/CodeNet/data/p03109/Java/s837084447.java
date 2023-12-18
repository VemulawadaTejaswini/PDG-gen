import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String[] y = x.split("/", 0);
        Calendar cl = Calendar.getInstance();
        cl.set(Integer.parseInt(y[0]), Integer.parseInt(y[1]), Integer.parseInt(y[2]));
        Calendar clh = Calendar.getInstance();
        clh.set(2019, 4, 30);
        if(clh.compareTo(cl) >= 0){
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}