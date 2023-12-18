import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            a.add(sc.nextInt());
        }

        List<Integer> score = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            score.add(k - q);
        }
        for (int i = 0; i < q; i++) {
            score.set(a.get(i) - 1, score.get(a.get(i) - 1) + 1);
        }

        String result = "";
        for (int i = 0; i < n; i++) {
            if (score.get(i) <= 0){
                result += "No\n";
            } else{
                result += "Yes\n";
            }
        }

        System.out.println(result);
    }
}
