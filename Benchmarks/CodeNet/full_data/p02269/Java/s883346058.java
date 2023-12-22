import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _CDictionary {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String sp = bf.readLine();
            if (sp.charAt(0)=='i'){
                hashSet.add(sp.substring(6));
            }else {
                System.out.println(hashSet.contains(sp.substring(6))?"yes":"no");
            }
        }
    }
}
