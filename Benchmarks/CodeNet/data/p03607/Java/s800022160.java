import java.util.*;

public class Main {
    public static void main(String[] args) {
        //最後の数値計算
        int answer = 0;

        //入力部
        Scanner sc = new Scanner(System.in);
        int roopTimes = Integer.parseInt(sc.nextLine());

        ArrayList<String> inputAllNumbers = new ArrayList<>();
        HashSet<String> checkNumbers = new HashSet<>();            //探索時に使うやつ、重複をなくすためHashSet

        for (int i = 0; i < roopTimes; i++) {
            String inputNumber = sc.nextLine();
            inputAllNumbers.add(inputNumber);
            checkNumbers.add(inputNumber);
        }


        //@TODO この書き方はまだ完全に理解しきれてないので要勉強
        //表記方法はメソッド参照(Java8からの書き方）、クラス名:メソッド名で呼び出す
        //あー、なんとなくわかった
        //これsortの方法としてStringのcompareToを呼び出してるってっていう、ものすごいストレートな書き方なんだな
        //いいなこれ、かっこいい


        inputAllNumbers.sort(String::compareTo);

        for (String key : checkNumbers) {
            if (countSearch(inputAllNumbers, key) % 2 != 0) {
                answer += 1;
            }
        }

        System.out.println(answer);
    }

    //線形探索メソッド
    //あんまり機能を詰め込むと汎用性がなくなるので、単純にカウントして回数を返すだけにする
    static int countSearch(ArrayList<String> checkTarget, String key) {
        int count = 0;

        for (int i = 0; i < checkTarget.size(); i++) {
            if (checkTarget.get(i).equals(key)) {
                count += 1;
            }else{
                break;
            }
       }
        return count;
    }
}
