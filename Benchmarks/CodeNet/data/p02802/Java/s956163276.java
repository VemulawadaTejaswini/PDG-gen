import java.util.*;
public class Main {
	public static void main(String[] args){
        int totalCorrects = 0;
        int totalPenalties = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int previousP = 0;
        boolean receivedAc = false;
        for (int i = 0; i < m; ++i) {
            int p = sc.nextInt();
            if (p > previousP) {
                receivedAc = false;
            }
            previousP = p;
            String s = sc.next();
            if (s.equals("AC")) {
                if (!receivedAc) {
                    totalCorrects++;
                }
                receivedAc = true;
            } else {
                if (receivedAc == false) {
                    totalPenalties++;
                }
            }
        }
        System.out.println(totalCorrects + " " + totalPenalties);
	}
}