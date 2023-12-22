
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String sp = bf.readLine();
            if (sp.charAt(0)=='i'){
                hashSet.add(sp.substring(7));
            }else {
               sb.append(hashSet.contains(sp.substring(5))?"yes\n":"no\n");
            }
        }
        bf.close();
        System.out.print(sb.toString());
    }
}
