import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer,Integer> rankScore = new TreeMap<>();

        for (int i = 0; i < n ; i++) {
            rankScore.put(sc.nextInt(), sc.nextInt());
        }

        //int goodrank = rankScore.keySet().stream().min(Comparator.naturalOrder()).get();
        int badrank = rankScore.keySet().stream().max(Comparator.naturalOrder()).get();

        int scorebad = rankScore.get(badrank);
        badrank += scorebad;

        System.out.print(badrank);
    }
}