import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class Item {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> hatenum = new ArrayList<>();
        List<Integer> oneToTen = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        int paymoney = in.nextInt();
        int n = in.nextInt();
        int i = 0;
        while(i < n){
            hatenum.add(in.nextInt());
            i++;
        }
        oneToTen.removeAll(hatenum);
        int[] ud = {1, 10, 100, 1000, 10000};
        int[] di = {0, -1, -1, -1, -1};
        while (true) {
            int total = 0;
            for(int k = 0;-1 < di[k];k++) {
                total += ud[k] * oneToTen.get(di[k]);
            }
            if(paymoney < total) {
                System.out.println(total);
                break;
            }
            for (int k = 0;-1 < di[k];k++) {
                if (oneToTen.size() == di[k]) {
                    di[k] = 0;
                    di[k+1] += 1;
                }
            }
        }
    }
}