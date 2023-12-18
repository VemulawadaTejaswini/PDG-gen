import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;

public class Main {

    public static Integer getKey(Integer val){
        int last = val % 10;
        int first = val;
        while(first >= 10){
            first /= 10;
        }
        return first * 10 + last;
    }

    public static int exchange(int k){
        return (k/10)+(k%10)*10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Long> mp =
                IntStream.rangeClosed(1, N).boxed()
                    .collect(
                            Collectors.groupingBy(Main::getKey, counting())
                );
        long cnt=0;
        for(Integer i:mp.keySet()){
            int j = exchange(i);
            if(mp.containsKey(j))
                cnt += mp.get(i) * mp.get(j);
        }
        System.out.println(cnt);

    }
}
