
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ABC141C {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Integer n = Integer.valueOf(scan.next());
        Integer k = Integer.valueOf(scan.next());
        Integer q = Integer.valueOf(scan.next());

        LinkedHashMap<Integer, Integer> score = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            score.put(i, k);
        }

        Integer ikiti = 0;

        for (int i = 0; i < q; i++) {
            Integer winner = Integer.valueOf(scan.next());
            score.put(winner,score.get(winner)+1);
            ikiti++;
            //System.out.println(score);
        }

        String result = "";
        for(int now : score.values()){
            result+=(now<=ikiti?"No":"Yes")+"\n";
        }

        System.out.println(result);
    }

}
