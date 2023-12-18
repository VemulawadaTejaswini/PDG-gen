import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in_num = sc.nextInt();
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i < in_num ;i++){
            int a = sc.nextInt();
            if(m.containsKey(a)){
                System.out.println("NO");
                return;
            }else{
                m.put(a, null);
            }
        }
        System.out.println("YES");
    }
}