import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String answer = "No";
        int totalVotes = 0;
        int popCount = 0;
        int kind = Integer.parseInt(sc.next());
        int pop = Integer.parseInt(sc.next());
        ArrayList<Integer> products = new ArrayList<>();
        for (int i = 0; i < kind; i++) {
            int vote = Integer.parseInt(sc.next());
            totalVotes += vote;
            products.add(vote);
        }

        int condNum = totalVotes / (4 * pop);
        for (int p : products) {
            if (p >= condNum) {
                popCount++;
            } else {
                continue;
            }

            if (popCount >= pop) {
                answer = "Yes";
                break;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
