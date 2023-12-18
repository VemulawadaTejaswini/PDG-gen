import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();

        long diff = b-a;

        if(diff >= 2019){
            System.out.println(0);
        }else{
            long min = Integer.MAX_VALUE;

            HashMap<Long,Integer> ab = new HashMap();
            for (long i = a; i <= b; i++) {
                ab.putIfAbsent(i % 2019,1);
            }

            ArrayList<Long> list = new ArrayList<>(ab.keySet());
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    min = Math.min((list.get(i) * list.get(j)) % 2019, min);
                }
            }

            System.out.println(min);
        }
    }
}