import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        //1行目
        Integer intN = scan.nextInt();
        Integer intM = scan.nextInt();
        int[] highArr = new int[intN + 1];

        //2行目
        for (int i = 1; i <= intN; i++) {
            highArr[i] = scan.nextInt();
        }

        //3行目以降
        List<Integer> ngList = new ArrayList<Integer>();

        while (scan.hasNext()) {
            Integer intLeft = scan.nextInt();
            Integer intRight = scan.nextInt();
            if(highArr[intLeft] < highArr[intRight]) {
                ngList.add(intLeft);
            } else if (highArr[intLeft] > highArr[intRight]) {
                ngList.add(intRight);
            } else {
                ngList.add(intLeft);
                ngList.add(intRight);
            }
        }

        scan.close();
        // 結果
        ArrayList<Integer> retList = new ArrayList<Integer>(new HashSet<>(ngList));
        System.out.println(intN - retList.size());
    }
}
