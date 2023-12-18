import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer,Integer> ACnum = new HashMap<>();
        int wa=0;
        for (int i = 0; i< M; i++){

            Integer p = Integer.valueOf(sc.nextInt());
            if (sc.next().equals("AC")){
                ACnum.put(p,1);
            }else{
                if(!ACnum.containsKey(p)){
                wa++;
                }
            }

        }
        System.out.println(ACnum.size() + " " + wa);
    }
}
