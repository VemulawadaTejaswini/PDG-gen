import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by admin on 2017/05/02.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int W = scan.nextInt();
        long totalW = 0;
        long totalV = 0;

        ArrayList<Integer[]> data = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int w = scan.nextInt();
            int v = scan.nextInt();
            int wv = (int) (v * 1.0 / w * 1000.0);
            data.add(new Integer[]{w, v, wv});
            //System.out.println(i);
        }
        data.sort((a, b) -> b[2] - a[2]);
        for (int i = 0; i < data.size(); i++) {
            if(data.get(i)[0]+totalW<=W){
                totalW+=data.get(i)[0];
                totalV+=data.get(i)[1];
            }
        }
        System.out.println(totalV);
    }
}
