import java.util.*;

public class Main {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<String> list = new ArrayList <String>();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (list.contains(str)) {
                list.remove(str);
            } else {
                list.add(str);
            }
        }
        
        System.out.println(list.size());
        
    }
}