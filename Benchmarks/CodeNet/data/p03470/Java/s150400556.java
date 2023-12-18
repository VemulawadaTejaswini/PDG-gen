import java.util.*;

public class Main {

    public static void main (String [] args){
        Scanner  sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> num = new HashSet<>();
        for (int i =0;i<N;i++){
            int d = sc.nextInt();
            if (!num.contains(d)){
                num.add(d);
            }
        }
        System.out.println(num.size());
    }
}