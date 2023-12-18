import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numStr = sc.next();
        LinkedList<Integer> lastNum = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char tmp = numStr.charAt(i);
            lastNum.add(Integer.parseInt(String.valueOf(tmp)));
        }

        for (int i = 0; i < n - 1; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            int countMax = lastNum.size() - 1;
            for (int j = 0; j < countMax; j++) {
                int value = Math.abs(lastNum.get(j) - lastNum.get(j + 1));
                tmp.add(value);
            }

            lastNum.clear();
            lastNum.addAll(tmp);
        }

        System.out.println(lastNum.get(0));
    }
}
