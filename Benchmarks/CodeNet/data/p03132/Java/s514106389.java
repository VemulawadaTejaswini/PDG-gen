import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int l = toInt(getLine());
        int oneNumTotal = 0;
        long[] stone = new long[l];
        long[] actual1 = new long[l];
        long[] actual2 = new long[l];
        for(int i =0 ; i<l ; i++) {
            stone[i] = toLong(getLine()) % 2;
            if(stone[i] == 1) {
                oneNumTotal++;
            }
//            print("stone: " + stone[i]);
        }

        int oneNum = oneNumTotal;
        // 最初の1の場所を特定
        int firstOne = 0;
        for(int i=0; i<l; i++) {
            if(stone[i] == 1) {
                firstOne = i;
                break;
            }
        }
        // １が残り一個になるまで移動
        for(int i=firstOne; i<l; i++) {
            try{
                if(i == firstOne && stone[i] == 1) {
                    actual1[i] = 1;
                }
            }catch (Exception e){}
            if(stone[i] == 1) {
                oneNum--;
            }
            try {
                if (oneNum <= 1 && stone[i + 1] == 0) {
                    break;
                }
            }catch(Exception e) {}
        }
        // 差異を数える
        int diff1 = 0;
        for(int i=0; i<l; i++) {
            if(stone[i] != actual1[i]) {
                diff1++;
            }
        }

        // 反対から同じことをする
        oneNum = oneNumTotal;
        // 最初の1の場所を特定
        firstOne = 0;
        for(int i=l-1; i>=0; i--) {
            if(stone[i] == 1) {
                firstOne = i;
                break;
            }
        }
        // １が残り一個になるまで移動
        for(int i=firstOne; i>=0; i--) {
            try{
                if(i == firstOne && stone[i] == 1) {
                    actual1[i] = 1;
                }
            }catch (Exception e){}
            if(stone[i] == 1) {
                oneNum--;
            }
            try {
                if (oneNum <= 1 && stone[i - 1] == 0) {
                    break;
                }
            } catch (Exception e) {
            }
        }
        // 差異を数える
        int diff2 = 0;
        for(int i=0; i<l; i++) {
            if(stone[i] != actual2[i]) {
                diff2++;
            }
        }

        for(int i =0 ; i<l ; i++) {
//            print("actual1: " + actual1[i]);
        }

        for(int i =0 ; i<l ; i++) {
//            print("actual2: " + actual2[i]);
        }

        int answer = diff1 > diff2 ? diff2 : diff1;
        print("" + answer);
    }

    public static int getInt() {
        return scan.nextInt();
    }

    public static String getLine() {
        return scan.nextLine();
    }

    public static int toInt(String str) {
        return Integer.parseInt(str);
    }

    public static long toLong(String str) {
        return Long.parseLong(str);
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
