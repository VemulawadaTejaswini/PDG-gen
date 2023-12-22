import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] s = br.readLine().split(" ");
        br.readLine();
        String[] t = br.readLine().split(" ");
        
        Set<String> set = new HashSet<String>(Arrays.asList(s));
        set.retainAll(Arrays.asList(t));
        System.out.println(set.size());
    }
}
