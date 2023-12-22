import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> participantMap = new HashMap<>();
        int count = 0;

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {//n回繰り返し
            int participantNum = i;
            int participantHeight = sc.nextInt();
            participantMap.put(participantNum, participantHeight); //参加者番号と身長の入ったリスト作る
        }

        for(Map.Entry<Integer,Integer> entryi: participantMap.entrySet()){
            int keyI = entryi.getKey();
            int valueI = entryi.getValue();
            for(Map.Entry<Integer,Integer> entryk: participantMap.entrySet()){
                int keyK = entryk.getKey();
                int valueK = entryk.getValue();

                if(Math.abs(keyI - keyK) == valueI + valueK){
                    count++;
                }
            }
        }
        System.out.println(count/2);
    }
}
