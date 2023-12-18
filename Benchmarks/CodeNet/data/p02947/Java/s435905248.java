import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
     
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
 
        char[] cline = new char[10];
        String key = "";
        long tmpCount = 0;
        long count = 0;//結果
        
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            tmpCount = 0;

            cline = sc.next().toCharArray();
            Arrays.sort(cline);
            key = String.valueOf(cline);
            tmpCount = map.getOrDefault(key, 0);

            count += tmpCount;

            map.put(key, (int) (tmpCount + 1));
        }
        
        System.out.println(count);
    }
}
