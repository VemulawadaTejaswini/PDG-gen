import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String[] B = new String[(int)(N)];
        
        for(int i = 0 ; i < N ; i++){
                B[i] = sc.next();
                
        }
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        int a = 0;
        for (String s : B) {
        int v = 0;
        if (m.containsKey(s)) {
        // Mapに登録済み
        v = m.get(s) + 1;
        a++;
        } else {
        // Mapに未登録
        v = 1;
        }
        m.put(s, v);
        }
        
        System.out.println(N - a);
     }
}