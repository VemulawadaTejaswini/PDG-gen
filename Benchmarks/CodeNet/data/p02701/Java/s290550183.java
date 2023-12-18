import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashSet hs = new HashSet();
        
        for(int i=0; i<n; i++){
            String line = sc.nextLine();
            hs.add(line);
        }
        int ans = hs.size();
        System.out.println(ans);
    }
}
