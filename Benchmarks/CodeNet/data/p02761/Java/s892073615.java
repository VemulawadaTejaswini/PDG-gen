import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> s,c;
        s = new ArrayList<>();
        c = new ArrayList<>();
        for(int i=0;i<M;i++) {
            s.add(sc.nextInt());
            c.add(sc.nextInt());
        }
        int res = IntStream.range(pow10(N-1), pow10(N)).filter(a->
                {
                    for(int i=0;i<M;i++){
                        if(getKeta(N-s.get(i)+1, a) != c.get(i)){
                            return false;
                        }
                    }
                    return true;
                }
        ).findFirst().orElseGet(()->-1);
        System.out.println(res);
    }

    private static int getKeta(int k, int val){
        return (val / pow10(k-1)) % 10;
    }

    private static int pow10(int k){
        if(k == 0){return 1;}
        return pow10(k-1) * 10;
    }

}