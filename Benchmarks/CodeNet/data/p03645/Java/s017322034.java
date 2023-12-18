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

        ArrayList<Long> ok = new ArrayList<>();
        ArrayList<Long> go = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            long temp1 = scanner.nextInt();
            long temp2 = scanner.nextInt();
            if(temp1 == 1){
                go.add(temp2);
            }
            if(temp2 == N){
                ok.add(temp1);
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
