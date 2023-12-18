import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Set<Integer> set =
            IntStream.rangeClosed(1,N).boxed().collect(Collectors.toSet());
        for(int i=0;i<K;i++){
            int d = sc.nextInt();
            for(int j=0;j<d;j++){
                Integer a = sc.nextInt();
                if(set.contains(a))
                    set.remove(a);
            }
        }
        System.out.println(set.size());
    }

}
