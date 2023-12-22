import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = 0;
        int N = 0;
        X = scanner.nextInt();
        N = scanner.nextInt();
        if (N != 0) {
            int[] suuretu = new int[N];
            for (int i = 0; i < N; i++) {
                suuretu[i] = scanner.nextInt();
            }
            Arrays.sort(suuretu);

            int[] junban = new int[suuretu[N - 1] - suuretu[0] + 1];
            int index = 0;
            for (int i = suuretu[0]; i <= suuretu[N - 1]; i++) {
                junban[index] = i;
                index++;
            }

            List<Integer> suuretuList = toList(suuretu);
            List<Integer> junbanList = toList(junban);
            junbanList.removeAll(suuretuList);
            List<Integer> sabunList = new ArrayList<>();
            List<Integer> sabunAtaiList = new ArrayList<>();
            for (Integer info : junbanList) {
//                System.out.println(info);
                sabunList.add(Math.abs(info - X));
                sabunAtaiList.add(info);
            }
            Object[] sabun = sabunList.toArray();
            Object[] sabunAtai = sabunAtaiList.toArray();

            int intMin = (int) sabun[0];
            int minIndex = 0;
            for (int i = 1; i < sabun.length; i++) { // 要素0番目のは代入済みのため1番目から開始する

                //intMinに代入されている値と配列の要素を比較して、配列の要素のほうが小さい場合値を上書きする.
                if (intMin > (int) sabun[i]) {
                    intMin = (int) sabun[i];
                    minIndex = i;
                }
            }
            System.out.println(sabunAtai[minIndex]);

        } else {

            System.out.println(X);
        }


    }

    public static ArrayList<Integer> toList(int[] arr){
        // int[] -> ArrayList<Integer>
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int t : arr) list.add(t);
        return list;
    }
}
