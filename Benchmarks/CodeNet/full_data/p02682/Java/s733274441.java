import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //切り出しする文字列
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> listA = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0; i<A; i++){
            listA.add(1);
        }
        for(int i=0; i<A; i++){
            listA.add(0);
        }
        for(int i=0; i<A; i++){
            listA.add(-1);
        }
        for(int i=0; i<K; i++){
            sum += listA.get(i);
        }
        System.out.println(sum);
    }
}
