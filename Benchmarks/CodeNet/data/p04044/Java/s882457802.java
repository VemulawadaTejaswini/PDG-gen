
import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String s[] = new String[n];
        List<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
            list.add(s[i]);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(s[i]);
        }
        System.out.println(sb);
    }
}