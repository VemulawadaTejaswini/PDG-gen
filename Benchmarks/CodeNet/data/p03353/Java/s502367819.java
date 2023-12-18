import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int k = sc.nextInt() - 1;
        
        Set<String> treeSet = new TreeSet<String>();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                treeSet.add(str.substring(j, j + i));
            }
        }
        
        List<String> list = new ArrayList<String>(treeSet);
        System.out.println(list.get(k));
    }
}
