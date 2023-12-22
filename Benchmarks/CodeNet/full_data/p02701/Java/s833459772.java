import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String,Integer> m = new HashMap<>();
        for(int i=0;i<N;i++){
            String S = sc.next();
            if(m.get(S)==null){
                m.put(S, 1);
            }else{
                int tmp = m.get(S);
                m.put(S, ++tmp);
            }
        }
        System.out.println(m.size());
    }
}