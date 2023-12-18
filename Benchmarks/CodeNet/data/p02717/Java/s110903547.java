import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        sc.close();

        List<Long> list = new ArrayList<>();
        Map<Long, Boolean> map = new HashMap<>();
        long lnum = -1;
        long newnum = N;
        long min = 1000000000000000000L; 

        if (N % K == 0) {
            System.out.println(0);
        } else {
            
        

        while(newnum % K != 0){
            newnum = Math.abs(newnum - K);
            
            if(newnum < min){
                min = newnum;
            }
            if(list.contains(newnum)){
                break;
            }
            else{
                list.add(newnum);
            }
        }

        System.out.println(min);
    }
}
    
}

       