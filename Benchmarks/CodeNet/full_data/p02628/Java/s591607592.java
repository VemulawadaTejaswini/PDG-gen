import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < K;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int min = 0;
        for(int i = 0;i < N;i++){
            min += list.get(i);
        }
        System.out.println(min);
    }
}
