// mainメソッドを含むKPクラスを書く
import java.util.Scanner;
import java.io.*;
 
public class KP
{
    public static void main(String[] args)
    {
        // ファイルの読み込み
        Scanner reader = new Scanner(System.in);
        String firstData[] = {};
        // まず、1行目を特別なものとして読み込む
        firstData = reader.nextLine().split(" ", -1);
 
        // それをもとに各種フィールドを設定する
        int answer; // 品物の数size，ナップサックの容量(重量の上限)limitWeight，答えanswer
        int size = 0;
        size = Integer.valueOf(firstData[0]);
        int limitWeight = Integer.valueOf(firstData[1]);
 
        String nextLine = null;
        String nextLineSplitted[] = new String[2];
        int weight[] = new int[size];
        int value[] = new int[size];
 
        int counter = 0;
        for(int i=0;i<size;i++)
        {
            nextLine = reader.nextLine();
         
            // 重さ 価値の順に入る
            nextLineSplitted = nextLine.split(" ", -1);
            weight[counter] = Integer.valueOf(nextLineSplitted[0]);
            value[counter] = Integer.valueOf(nextLineSplitted[1]);
            counter++;
        }        // 必要に応じて内容の確認
        Solver s = new Solver(size, limitWeight, weight, value);
        answer = s.solve();
        System.out.println(answer);
    }
// Solverクラスを書く
public class Solver
{
    int answer = 0;
    int size, limitWeight;
    int[] weight, value;
    // 縦、横、内容物
    int[][][] answerArray;
 
    int bestWeight = 0;
 
    // コンストラクタ
    public Solver(int size, int limitWeight, int[] weight, int[] value)
    {
        this.size = size;
        this.limitWeight = limitWeight;
        this.weight = weight;
        this.value = value;
        answerArray = new int[size][limitWeight + 1][2];
    }
 
    int solve()
    {
        if (size == 0)
        {
            System.out.println("入力がありません。");
            return 0;
        }
        if (limitWeight == 0)
        {
            System.out.println("限界重量が不正な値です");
            return 0;
        }
        // 正常な値と仮定する
        // 求めたいのは「組み合わせ」
        // 二次元配列で保存する必要性はない
 
        // 一つずつ比較する数を増やしていく
        for (int i = 0; i < size; i++)
        {
            int checkingWeight = weight[i];
            int checkingValue = value[i];
            if (checkingWeight > limitWeight)
            {
                continue;
            }
            // checing要素を根源要素としてAnserArrayに保存
            answerArray[i][checkingWeight][0] = checkingWeight;
            answerArray[i][checkingWeight][1] = checkingValue;
            if(answer<checkingValue)
            {
                answer = checkingValue;
                bestWeight = checkingWeight;
            }
 
            // Answer候補一つ一つに対して処理を行う
            for (int j = 0; j < i; j++)
            {
                for (int k = 0; k < limitWeight; k++)
                {
                    // answerArray[j][k]にはj行k列目の要素が入っている
                    // 各要素ごとに2つの要素weightとvalueが格納されている
 
                    // 中身が空ならAnswer候補はないものとしてスルーする
                    if (answerArray[j][k][0] == 0 && answerArray[j][k][1] == 0)
                    {
                        continue;
                    } else
                    {
                        try
                        {
                            int tmpWeight = answerArray[j][k][0] + checkingWeight;
                            int tmpValue = answerArray[j][k][1] + checkingValue;
 
                            // tmpWeight<=limitWeight
 
                            if (tmpWeight <= limitWeight)
                            {
                                if (answer < tmpValue)
                                {
                                    answer = tmpValue;
                                    bestWeight = tmpWeight;
                                }
                                answerArray[i][tmpWeight][0] = tmpWeight;
                                if (answerArray[i][tmpWeight][1] < tmpValue)
                                {
                                    answerArray[i][tmpWeight][1] = tmpValue;
                                }
                            }
                        } catch (ArrayIndexOutOfBoundsException e)
                        {
                            System.out.println("Solver:anserArrayに対するアクセス違反");
                            e.printStackTrace();
                            System.exit(-1);
                        }
                    }
                }
            }
            //debug start
        }
        return answer;
    }
}
}
