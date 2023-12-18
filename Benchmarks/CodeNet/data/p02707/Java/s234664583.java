import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < l - 1; i++) {
            int item = sc.nextInt();
            map.put(item,map.getOrDefault(item,0) + 1);
        }
        for(int i = 1;i < l + 1;i++){
            System.out.println(map.getOrDefault(i,0));
        }
    }
}
