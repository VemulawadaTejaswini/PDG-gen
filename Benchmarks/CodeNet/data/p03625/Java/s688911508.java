import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            map.put(a, map.containsKey(a) ? map.get(a) + 1 : 1);
        }

        int a = 0;
        int b = 0;

        int tmp = 1;

        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            if(ent.getValue() >= 4) {
                a = Math.max(ent.getKey(), a);
                b = Math.max(ent.getKey(), b);
            }else if(ent.getValue() >= 2){
                if(tmp == 1) {
                    b = Math.max(ent.getKey(), b);
                    tmp++;
                }else{
                    a = Math.max(ent.getKey(), a);
                    tmp--;
                }
            }
        }

        System.out.println(a*b);
    }
}
