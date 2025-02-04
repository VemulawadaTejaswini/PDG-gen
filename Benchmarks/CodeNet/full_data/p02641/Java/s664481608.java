
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int n = sc.nextInt();

        if(n == 0){
            System.out.println(x);
            return;
        }else {

            List<Integer> p = new ArrayList<>();
            for (int i = 0; i < n; i++){
                p.add(sc.nextInt());
            }


            int minValue = Integer.MAX_VALUE;
            int ans = 100;
            for (int i = 1; i <= 100; i++) {
                for(int j = 0; j < n; j++) {
                    if(!p.contains(i)){
                        if (minValue > Math.abs(i - x)) {
                            minValue = Math.abs(i - x);
                            ans = i;
                        }
                    }
                }
            }

            System.out.println(ans);
        }
    }
}