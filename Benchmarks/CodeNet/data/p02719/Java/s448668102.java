
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

        lnum = N % K;
        while(lnum > Math.abs(lnum - K)){
            lnum = Math.abs(lnum - K);
        }

        if(lnum <= Math.abs(lnum - K)){
            System.out.println(lnum);       
        }
        

    }
    
}

       