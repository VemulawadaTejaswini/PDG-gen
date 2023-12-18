import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNum = scanner.nextInt();
        int[] array = new int[peopleNum];
        for (int i = 0; i < peopleNum; i++) {
            int rate = scanner.nextInt();
            array[i] = judgeColor(rate);
        }
        Arrays.sort(array);
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for (int j = 0; j < array.length-1; j++) {
            if (array[j] != array[j+1]) {
                newArray.add(array[j]);
            } else if (array[j] == 9 && array[j+1] == 9) {
                newArray.add(array[j]);
            }
        }
        newArray.add(array[array.length-1]);

        int freeColorCnt = 0;
        for (int k = 0; k < newArray.size(); k++) {
            if (newArray.get(k) == 9) {
                freeColorCnt++;
            }
        }

        int minColorCnt = newArray.size() - freeColorCnt;
        int maxColorCnt = minColorCnt + freeColorCnt;

        if(newArray.size() == freeColorCnt) {
            minColorCnt = 1;
            maxColorCnt = freeColorCnt;
        }
        System.out.println(minColorCnt + " " + maxColorCnt);
    }
    public static int judgeColor(int rate) {
        if(rate >= 1 && rate <= 399) {
            return 1;
        } else if (rate >= 400 && rate <= 799) {
            return 2;
        } else if (rate >= 800 && rate <= 1199) {
            return 3;
        } else if (rate >= 1200 && rate <= 1599) {
            return 4;
        } else if (rate >= 1600 && rate <= 1999) {
            return 5;
        } else if (rate >= 2000 && rate <= 2399) {
            return 6;
        } else if (rate >= 2400 && rate <= 2799) {
            return 7;
        } else if (rate >= 2800 && rate <= 3199) {
            return 8;
        } else {
            return 9;
        }
    }
}
