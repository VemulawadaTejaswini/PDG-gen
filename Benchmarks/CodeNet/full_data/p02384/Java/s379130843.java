import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
/**
 * Lesson11B サイコロを転がすシミュレーションを行うプログラム
 * 
 * @author Internship
 * 
 */
public class Main{
 
    /**
     * プログラムのエントリポイント
     * 
     * @param args
     */
    public static void main(String[] args) {
 
        // 答えの格納場所
        ArrayList<Integer> intAryAnswer = new ArrayList<Integer>();
 
        // さいころ６面
        int[] intDice = new int[6];
 
        // 1行目を取得
        try {
            BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
 
            String strLine = insBR.readLine();
 
            // 分解
            String[] strAryLine1 = strLine.split(" ");
 
            // さいころの面の各数字を格納
            for (int i = 0; i < intDice.length; i++) {
                intDice[i] = Integer.parseInt(strAryLine1[i]);
            }
 
            // ２行目取得
            strLine = insBR.readLine();
 
            // 数を取得
            int intNum = Integer.parseInt(strLine);
 
            // 3行目以降取得
            for (int i = 0; i < intNum; i++) {
 
                strLine = insBR.readLine();
 
                // 分解
                String[] strAryLine2 = strLine.split(" ");
 
                // 上面の数を取得
                int intUnder = Integer.parseInt(strAryLine2[0]);
 
                // 前面の数を取得
                int intFront = Integer.parseInt(strAryLine2[1]);
 
                // 上面が1の時
                // 全面が2なら3とするを
                // 123とする
                // 123 135 142 154
                // 214 231 246 263
                // 312 326 351 365
                // 415 421 456 462
                // 513 536 541 564
                // 624 632 645 653
 
                // 123 135 142 154
                if (intUnder == intDice[0]) {
 
                    if (intFront == intDice[1]) {
                        intAryAnswer.add(intDice[2]);
                    } else if (intFront == intDice[2]) {
                        intAryAnswer.add(intDice[4]);
                    } else if (intFront == intDice[3]) {
                        intAryAnswer.add(intDice[1]);
                    } else if (intFront == intDice[4]) {
                        intAryAnswer.add(intDice[3]);
                    }
 
                    // 214 231 246 263
                } else if (intUnder == intDice[1]) {
 
                    if (intFront == intDice[0]) {
                        intAryAnswer.add(intDice[3]);
                    } else if (intFront == intDice[2]) {
                        intAryAnswer.add(intDice[0]);
                    } else if (intFront == intDice[3]) {
                        intAryAnswer.add(intDice[5]);
                    } else if (intFront == intDice[5]) {
                        intAryAnswer.add(intDice[2]);
                    }
                    // 312 326 351 365
                } else if (intUnder == intDice[2]) {
 
                    if (intFront == intDice[0]) {
                        intAryAnswer.add(intDice[1]);
                    } else if (intFront == intDice[1]) {
                        intAryAnswer.add(intDice[5]);
                    } else if (intFront == intDice[4]) {
                        intAryAnswer.add(intDice[0]);
                    } else if (intFront == intDice[5]) {
                        intAryAnswer.add(intDice[4]);
                    }
                    // 415 421 456 462
                } else if (intUnder == intDice[3]) {
 
                    if (intFront == intDice[0]) {
                        intAryAnswer.add(intDice[4]);
                    } else if (intFront == intDice[1]) {
                        intAryAnswer.add(intDice[0]);
                    } else if (intFront == intDice[4]) {
                        intAryAnswer.add(intDice[5]);
                    } else if (intFront == intDice[5]) {
                        intAryAnswer.add(intDice[1]);
                    }
                    // 513 536 541 564
                } else if (intUnder == intDice[4]) {
 
                    if (intFront == intDice[0]) {
                        intAryAnswer.add(intDice[2]);
                    } else if (intFront == intDice[2]) {
                        intAryAnswer.add(intDice[5]);
                    } else if (intFront == intDice[3]) {
                        intAryAnswer.add(intDice[0]);
                    } else if (intFront == intDice[5]) {
                        intAryAnswer.add(intDice[3]);
                    }
                    // 624 632 645 653
                } else if (intUnder == intDice[5]) {
 
                    if (intFront == intDice[1]) {
                        intAryAnswer.add(intDice[3]);
                    } else if (intFront == intDice[2]) {
                        intAryAnswer.add(intDice[1]);
                    } else if (intFront == intDice[3]) {
                        intAryAnswer.add(intDice[4]);
                    } else if (intFront == intDice[4]) {
                        intAryAnswer.add(intDice[2]);
                    }
                }
            }
 
            // 答えが何個あるか取得
            int intSize = intAryAnswer.size();
 
            // 出力
            for (int i = 0; i < intSize; i++) {
                System.out.println(intAryAnswer.get(i));
            }
 
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字で入力して下さい");
        }
    }
}