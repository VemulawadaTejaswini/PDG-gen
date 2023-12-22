import java.util.*;

public class Main{
    /**
     * メインメソッド
     */
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final ArrayList<Long> Lengths = new ArrayList<Long>();
        // while(sc.hasNext()){
        //     Lengths.add(sc.nextLong());
        // }
            for (int i = 0; i < N; i++){
                Lengths.add(sc.nextLong());
            }
        sc.close();
        final int answer = Logics(N, Lengths);
        System.out.println(answer);
    }

    /**
     * ロジック
     */
    public static int Logics(int N, List<Long> list) {
        int answer = 0;
        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++){
                for (int k = j + 1; k < N; k++){
                    boolean judge1 = (list.get(i) == list.get(j) || list.get(i) == list.get(k) || list.get(j) == list.get(k));
                    boolean judge2 = (list.get(i) + list.get(j) > list.get(k) && list.get(j) + list.get(k) > list.get(i) && list.get(i) + list.get(k) > list.get(j));
                    if (judge1){
                        continue;
                    } else {
                        if(judge2) {
                            answer ++;
                        }
                    }
                }
            }
        }
        return answer;
    }
}