import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        // String s = sc.next();

        // 処理
        // hight
        final Tenbo[] tenbo = new Tenbo[n];
        for (int i = 0; i < n; i++) {
            tenbo[i] = new Tenbo();
            tenbo[i].hight = sc.nextInt();
        }

        // con
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            tenbo[a-1].con.add(b-1);
            tenbo[b-1].con.add(a-1);
        }

        int out = 0;

        for(int i = 0; i < n; i++){
            if(tenbo[i].con.size() == 0){
                out++;
                continue;
            }
            boolean flg = true;
            for(int j = 0; j < tenbo[i].con.size(); j++){
                if(tenbo[i].hight <= tenbo[tenbo[i].con.get(j)].hight){
                    flg = false;
                    break;
                }
            }
            if(flg == true) out++;
        }

        // 出力
        System.out.println(out);
    }

    public static class Tenbo {
        int hight;
        ArrayList<Integer> con = new ArrayList<>();
    }
}
