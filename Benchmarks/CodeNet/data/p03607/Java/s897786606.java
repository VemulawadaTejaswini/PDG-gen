import java.util.*;

public class Main {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList <Integer>();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            Integer a = (Integer) sc.nextInt();
            if (list.contains(a)) {
                list.remove(list.indexOf(a));
            } else {
                list.add(a);
            }
        }
        
        System.out.println(list.size());
        
    }
}