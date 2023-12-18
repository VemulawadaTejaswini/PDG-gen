import java.math.BigInteger;
import java.util.*;



/**
 * Created by santa on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long M = scanner.nextLong();

        int[][] map = new int[200005][2];
        ArrayList<Integer> ok = new ArrayList<>();
        ArrayList<Integer> go = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            map[i][0] = scanner.nextInt();
            map[i][1] = scanner.nextInt();
            if(map[i][0] == 1){
                go.add(map[i][1]);
            }
            if(map[i][1] == N){
                ok.add(map[i][0]);
            }
        }

        int flag = 0;
        for (int i = 0; i < go.size(); i++) {
            for (int j = 0; j < ok.size(); j++) {
                if(go.get(i) == ok.get(j)){
                    flag = 1;
                }
            }
        }


        if(flag == 1){
            System.out.println("POSSIBLE");

        }else{
            System.out.println("IMPOSSIBLE");
        }



    }


} // MainClass
