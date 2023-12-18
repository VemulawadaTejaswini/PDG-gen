import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> participantMap = new HashMap<>();
        int count = 0;

        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 1; i <= n; i++) {//n回繰り返し
            numbers[i - 1] = i;//1〜Nまでの数字の配列を生成
            int participantNum = i;
            int participantHeight = sc.nextInt();
            participantMap.put(participantNum, participantHeight); //参加者番号と身長の入ったMapの生成
        }

        for(int i = 1;i <= n;i++){//1からnまでループ
            for(int k = i + 1; k <= n;k++){//nC2回の探索で済ませるためのこれ
                if(Math.abs(i - k) == participantMap.get(i) + participantMap.get(k)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
