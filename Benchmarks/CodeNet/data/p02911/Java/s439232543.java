import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //もろもろを定義する
        int NumAllParticipants = sc.nextInt();
        int StartPoint = sc.nextInt();
        int NumCollectAnswer = sc.nextInt();
        
        Integer collectAnswerPerson[] = new Integer[NumAllParticipants];
        for (int i = 0; i < NumAllParticipants - 1; i++) {
            collectAnswerPerson[i] = sc.nextInt();
        }
        
        
        Map<String, Integer> roundResultMap = new HashMap;

        for(Integer i : collectAnswerPerson) {
        roundResultMap.merge(i, 1, Integer::count++);
        
        //判定する。正解者となった回数<初期ポイントなら勝ち抜け
        //roundResultList.steam().collect(Collections.groupingBy(x -> x, Collectors.counting()));
        
        //if()
        
        
        //勝ち抜けた参加者の行にYesを、敗退した参加者の行にNoをラウンド結果列に格納する
        
        //ラウンド結果列を出力する
        System.out.println(roundResultMap);
        
        //間に合わなかったため途中で提出する
    }
}