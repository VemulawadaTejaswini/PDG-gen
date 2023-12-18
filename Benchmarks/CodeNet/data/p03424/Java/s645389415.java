import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> count = new HashMap<>();

        for (int i = 0; i < n ; i++) {
            String s = sc.next();
            count.put(s,1);
        }

        final int sum = count.values().stream().mapToInt(Integer::intValue).sum();
        if(sum==3){
            System.out.print("Three");
        }else if (sum==4){
            System.out.print("Four");
        }
    }
}