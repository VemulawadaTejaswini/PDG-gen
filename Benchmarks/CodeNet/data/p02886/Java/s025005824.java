import java.util.*;

class VariableObj {

    // たこ焼きの数
    public static int num_tako;

}

public class Main {
    public static void main(String... args){

        // 入力の受け取り
        Scanner scanner = new Scanner(System.in);

        VariableObj.num_tako = scanner.nextInt();
        // 美味しさの数値
        ArrayList<Integer> arr_oishisa = new ArrayList<Integer>();
        for(int i = 0; i < VariableObj.num_tako; i++){
            arr_oishisa.add(scanner.nextInt());
        }

        // ２個選びその回復量を計算
        //      ansに蓄積していく
        long ans = 0;
        for(int i = 0; i < VariableObj.num_tako; i++){
            for(int j = i; j < VariableObj.num_tako; j++){
                // 同じもの同士はパス
                if (i == j){ continue;}
                ans += arr_oishisa.get(i) * arr_oishisa.get(j);
            }
        }
        
        System.out.println(ans);

    }
}
