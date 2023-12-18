import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> R = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            R.add(x * 1000 + y);
        }
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            B.add(x * 1000 + y);
        }
        Collections.sort(R);
        Collections.sort(B);
        int ans = 0;
        Integer tmp;
        for(Integer b : B){
            tmp = 0;
            for(Integer r : R){
                if(r/1000 < b/1000 && r%1000 < b%1000 && tmp%1000 < r%1000) tmp = r;
            }
            if(R.contains(tmp)){
                ans++;
                R.remove(tmp);
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
