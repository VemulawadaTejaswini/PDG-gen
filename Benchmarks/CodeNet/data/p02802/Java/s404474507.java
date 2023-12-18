import java.util.*;
public class Main {
	public static void main(String[] args){
        HashMap<Integer, Boolean> results = new HashMap<>();
        int totalCorrects = 0;
        int totalPenalties = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; ++i) {
            int p = sc.nextInt();
            String s = sc.next();
            boolean hasReceivedAc = results.getOrDefault(p, false);
            if (!hasReceivedAc && s.equals("WA")) {
                totalPenalties++;
            }
            if (!hasReceivedAc && s.equals("AC")) {
                totalCorrects++;
                results.put(p, true);
            }
        }
        System.out.println(totalCorrects + " " + totalPenalties);
	}
}