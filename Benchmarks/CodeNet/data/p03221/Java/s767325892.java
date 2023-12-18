import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 県の数
        int kenAmount = scan.nextInt();

        // 各市の県番号、誕生年、元の順番、ID
        int shi[][] = new int[scan.nextInt()][4];

        // 各市の県番号、誕生年を標準入力から受け取る
        for(int i = 0; i < shi.length; i++) {
            shi[i][0] = scan.nextInt(); //県番号
            shi[i][1] = scan.nextInt(); //誕生年
            shi[i][2] = i;
        }
        
        // shiを県番号の昇順にソートする
        for(int i = 1; i < shi.length; i++) {
            if(shi[i - 1][0] > shi[i][0]) {
                int j = i;
                while(j >= 1 && shi[j - 1][0] > shi[j][0]) {
                    int tmp[] = shi[j];
                    shi[j] = shi[j - 1];
                    shi[j - 1] = tmp;
                }
            }
        }

        // shiを県番号の昇順を保ったまま誕生年の昇順にソートする
        for(int i = 1; i < shi.length; i++) {
            if(shi[i - 1][0] == shi[i][0] && shi[i - 1][1] > shi[i][1]) {
                int j = i;
                while(j >= 1 && shi[j - 1][0] == shi[j][0] && shi[j - 1][1] > shi[j][1]) {
                    int tmp[] = shi[j];
                    shi[j] = shi[j - 1];
                    shi[j - 1] = tmp;
                }
            }
        }

        // shiを元にIDを求める
        for(int i = 0, cnt = 0; i < shi.length; i++) {
            if(i >= 1 && shi[i][0] != shi[i - 1][0]) {
                cnt = 0;
            }

            cnt ++;
            shi[i][3] = 1000000 * shi[i][0] + cnt;
        }

        // shiを元の順番にソートしなおす
        for(int i = 1; i < shi.length; i++) {
            if(shi[i - 1][2] > shi[i][2]) {
                int j = i;
                while(j >= 1 && shi[j - 1][2] > shi[j][2]) {
                    int tmp[] = shi[j];
                    shi[j] = shi[j - 1];
                    shi[j - 1] = tmp;
                }
            }
        }

        // 各市のIDを12桁で出力
        for(int i = 0; i < shi.length; i++) {
            System.out.println(String.format("%012d", shi[i][3]));
        }

        scan.close();
        return;
    }
}