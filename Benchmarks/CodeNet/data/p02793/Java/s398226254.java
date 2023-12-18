import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static Long LCM(Long a, Long b){
        if(a < b){return LCM(b, a);}
        if(a % b == 0){
            return b;
        }else{
            return LCM(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        List<Long> llist = new ArrayList<>(N);
        for(int i=0;i<N;i++){
            llist.add(sc.nextLong());
        }
        Long result = llist.stream().reduce(
                new Long(1),
                (a, b)->{
                    return a*b/LCM(a,b);
                });
        Long ans = llist.stream()
                .reduce(
                        new Long (0),
                        (a, b)->{
                            return (a+(result/b)) % 1000000007;
                        }
                );
        System.out.println(ans % 1000000007);
    }
}
