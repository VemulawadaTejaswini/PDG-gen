import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        
        int n = Integer.parseInt(data);
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        
        for(int i = 0; i < n; i++)
        {
            String buf = sc.nextLine();
            linkedHashSet.add(buf);
        }
        
        Object[] after = linkedHashSet.toArray();
        
        
        System.out.println(after.length);
    }
}
