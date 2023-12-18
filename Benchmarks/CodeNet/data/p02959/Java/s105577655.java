import java.util.*;

public class Lession5 {

    public static void main(String[] args) {

        Scanner parameter = new Scanner(System.in);

        String[] input1 = parameter.nextLine().split(" ");
        String[] input2 = parameter.nextLine().split(" ");
        String[] input3 = parameter.nextLine().split(" ");

        // 倒す数を累計する
        Integer countKillMoster = 0;

        // 勇者の人数分でループする
        for (int i = 0; i < input3.length; i++) {

            // ループされてる勇者が何頭倒せる引数
        	Integer killNoOfMoster = Integer.valueOf(input3[i]);
            // 勇者に該当する街道のモンスター数
        	Integer noOfMosterThisStreet = Integer.valueOf(input2[i]);

            // 勇者がモンスターを倒せる数と該当する街道のモンスター数を比較する
        	if (killNoOfMoster <= noOfMosterThisStreet) {

                // 該当街道のモンスターを総数に加える
        		countKillMoster = countKillMoster + killNoOfMoster;
        	} else {

                // 次の街道のモンスター数
        		Integer noOfmosterNextStreet = Integer.valueOf(input2[i + 1]);
                // 二街道全部のモンスター数
        		Integer totalMoster = noOfMosterThisStreet + noOfmosterNextStreet;

                // 倒せるモンスター数が二街道総数より多く場合
        		if (killNoOfMoster >= totalMoster) {

                    // ２街道纏めて総数に加える
        			countKillMoster = countKillMoster + totalMoster;
                    // 街道２のモンスター数を0にする
        			input2[i + 1] = "0";
        		} else {

                    // 倒せたモンスター数を加える
        			countKillMoster = countKillMoster + killNoOfMoster;
                    // 街道２の残ったモンスター数を計算する
        			input2[i + 1] = String.valueOf(totalMoster - killNoOfMoster);
        		}
        	}
        }

        System.out.println(countKillMoster);
    }
}
