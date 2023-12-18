import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numList.add(Integer.parseInt(sc.next()));
        }
        numList.sort(Comparator.reverseOrder());
        int preNum = 0;
        for (int i = 0; i < numList.size(); i++) {
            int n = numList.get(i).intValue();
            if (n == preNum) {
                numList.remove(i);
            } else {
                preNum = n;
            }
        }
        System.out.println(numList.size());
    }
}